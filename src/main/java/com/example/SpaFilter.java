package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class SpaFilter implements GatewayFilter {

    private static final Logger logger = LoggerFactory.getLogger(SpaFilter.class);
    private static final String INDEX_PATH = "/index.html";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest req = exchange.getRequest();
        ServerWebExchange ex = req.getHeaders().getAccept().contains(MediaType.TEXT_HTML) ?
                exchange.mutate().request(r1 -> {
                    logger.info("Replace path: {} by {}", req.getPath(), INDEX_PATH);
                    r1.path(INDEX_PATH);
                }).build() : exchange;
        return chain.filter(ex);
    }
}