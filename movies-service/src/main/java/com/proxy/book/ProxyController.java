package com.proxy.book;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.cloud.gateway.mvc.ProxyExchange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyController {

    @GetMapping("/**")
    public ResponseEntity<?> proxy(HttpServletRequest request, ProxyExchange<byte[]> proxy) throws Exception {
        return proxy.uri("http://localhost:8081" + request.getRequestURI()).get();
    }

    @PostMapping("/**")
    public ResponseEntity<?> proxyPost(HttpServletRequest request, ProxyExchange<byte[]> proxy) throws Exception {
        return proxy.uri("http://localhost:8081" + request.getRequestURI()).post();
    }

    @PutMapping("/**")
    public ResponseEntity<?> proxyPut(HttpServletRequest request, ProxyExchange<byte[]> proxy) throws Exception {
        return proxy.uri("http://localhost:8081" + request.getRequestURI()).put();
    }

    @DeleteMapping("/**")
    public ResponseEntity<?> proxyDelete(HttpServletRequest request, ProxyExchange<byte[]> proxy) throws Exception {
        return proxy.uri("http://localhost:8081" + request.getRequestURI()).delete();
    }
}
