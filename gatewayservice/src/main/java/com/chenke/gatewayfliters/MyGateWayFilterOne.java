package com.chenke.gatewayfliters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class MyGateWayFilterOne implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info(">>>>>>>>>>>>>>>>>>>MyGateWayFilterOne begin<<<<<<<<<<<<<<<<<<<<");
        String username=exchange.getRequest().getQueryParams().getFirst("username");
        if(username==null)
        {
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            log.info(">>>>>>>>>>>>>>>>>>>username null<<<<<<<<<<<<<<<<<<<<");
            return exchange.getResponse().setComplete();
        }
        log.info(">>>>>>>>>>>>>>>>>>>MyGateWayFilterOne through<<<<<<<<<<<<<<<<<<<<");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
