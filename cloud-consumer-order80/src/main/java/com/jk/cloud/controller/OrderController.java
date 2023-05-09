package com.jk.cloud.controller;

import com.jk.cloud.entities.CommonResult;
import com.jk.cloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author jy-Jk<br/>
 * @description: <br/>
 * @date: 2023/5/9 16:11<br/>
 */
@RestController
public class OrderController {

    public static final String URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        return restTemplate.postForObject(URL + "/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        return restTemplate.getForObject(URL+"/payment/get/"+id,CommonResult.class,id);
    }
}
