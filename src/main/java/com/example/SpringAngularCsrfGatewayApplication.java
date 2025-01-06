package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAngularCsrfGatewayApplication implements ApplicationRunner {

    @Value("${app.angular}")
    private String frontend;

    @Value("${app.api}")
    private String api;

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularCsrfGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder, SpaFilter spaFilter) {

        if (frontend.isEmpty() || api.isEmpty()) {
            throw new IllegalStateException("front end and backed urls not configured in application.yml");
        }

        return builder.routes()
                .route("api", r -> r.path("/api/**").uri(api))
                .route("angular", r -> r.path("/**").filters(filter -> filter.filter(spaFilter)).uri(frontend))
                .build();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("FRONT END: " + frontend);
        System.out.println("BACK END: " + api);

    }
}
