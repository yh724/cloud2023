package com.jk.cloud.service.impl;

import com.jk.cloud.dao.PaymentMapper;
import com.jk.cloud.entities.Payment;
import com.jk.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jy-Jk<br/>
 * @description: <br/>
 * @date: 2023/5/9 14:37<br/>
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.selectById(id);
    }
}
