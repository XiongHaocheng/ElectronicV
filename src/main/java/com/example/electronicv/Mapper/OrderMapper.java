package com.example.electronicv.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.electronicv.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
