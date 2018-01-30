package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by lihaochun on 2018/1/3.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);

}
