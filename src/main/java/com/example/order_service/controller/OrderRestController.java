package com.example.order_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OrderRestController {
    @Value("${common.message}")
    private String commonMessage;

    @Value("${order.message}")
    private String orderMessage;

    @GetMapping("/order/info")
    public String getUserInfo() {
        return "Common: " + commonMessage + " | Order: " + orderMessage;
    }

}
