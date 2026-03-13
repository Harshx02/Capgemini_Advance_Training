package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.model.Product;

/**
 * Order Controller
 * Handles order placement
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	private final ProductClient productClient;
	
	public OrderController(ProductClient productClient) {
		this.productClient = productClient;
	}

    @GetMapping("/place/{productId}")
    public OrderResponse placeOrder(@PathVariable Long productId) {
    	Product product = productClient.getById(productId);
        return new OrderResponse(productId,product,"Successful");
    }
    
    public static class OrderResponse {
        private Long orderId;
        private Product product;
        private String status;


        public OrderResponse(Long orderId, Product product, String status) {
            this.orderId = orderId; this.product = product; this.status = status;
        }

        public Long getOrderId() { return orderId; }
        public void setOrderId(Long orderId) { this.orderId = orderId; }

        public Product getProduct() { return product; }
        public void setProduct(Product product) { this.product = product; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
    }
}