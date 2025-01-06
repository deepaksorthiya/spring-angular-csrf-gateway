//package com.example;
//
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SpaGatewayFilter extends AbstractGatewayFilterFactory<SpaGatewayFilter.Config> {
//    private final SpaFilter spaFilter;
//
//    public SpaGatewayFilter(SpaFilter spaFilter) {
//        super(Config.class);
//        this.spaFilter = spaFilter;
//    }
//
//    public static class Config {
//        // empty class
//    }
//
//    @Override
//    public GatewayFilter apply(Config config) {
//        return spaFilter;
//    }
//}
//
