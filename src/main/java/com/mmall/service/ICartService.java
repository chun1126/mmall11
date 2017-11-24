package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by lihaochun on 2017/11/17.
 */
public interface ICartService {
    ServerResponse add(Integer userId, Integer productId, Integer count);
}
