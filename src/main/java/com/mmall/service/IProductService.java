package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;

/**
 * Created by lihaochun on 2017/10/30.
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> setSaleStatus(Integer productId, Integer status);



}