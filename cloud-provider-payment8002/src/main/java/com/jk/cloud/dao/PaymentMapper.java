package com.jk.cloud.dao;

import com.jk.cloud.entities.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author jy-Jk<br/>
 * @description: <br/>
 * @date: 2023/5/9 14:33<br/>
 */
@Mapper
public interface PaymentMapper {
    int insert(Payment payment);

    Payment selectById(Long id);
}
