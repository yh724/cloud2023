package com.jk.cloud.controller;

import com.jk.cloud.entities.CommonResult;
import com.jk.cloud.entities.Payment;
import com.jk.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author jy-Jk<br/>
 * @description: <br/>
 * @date: 2023/5/9 14:35<br/>
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult<Void> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入操作返回结果: {}",result);
        if(result == 1){
            return new CommonResult<>(200, "success", null);
        } else {
            return new CommonResult<>(400,"fail",null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getById(@PathVariable Long id){
        return new CommonResult<>(200,"success! port: "+ serverPort ,paymentService.getPaymentById(id));
    }



}
