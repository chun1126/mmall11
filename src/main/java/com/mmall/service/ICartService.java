package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

/**
 * Created by lihaochun on 2017/11/17.
 */
public interface ICartService {
    ServerResponse add(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> list(Integer userId);
    ServerResponse<CartVo> update(Integer userId, Integer count, Integer productId);
    ServerResponse<CartVo> deleteProduct(Integer userId,String productIds);

}
