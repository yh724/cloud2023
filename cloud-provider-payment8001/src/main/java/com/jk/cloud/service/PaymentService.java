package com.jk.cloud.service;

import com.jk.cloud.entities.Payment;

/**
 * @author jy-Jk<br/>
 * @description: <br/>
 * @date: 2023/5/9 14:35<br/>
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
