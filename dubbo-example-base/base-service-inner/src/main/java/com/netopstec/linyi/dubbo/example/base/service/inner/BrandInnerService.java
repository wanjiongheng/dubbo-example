package com.netopstec.linyi.dubbo.example.base.service.inner;

import com.netopstec.linyi.dubbo.example.api.ObjectResponse;
import com.netopstec.linyi.dubbo.example.entity.InnerBrand;

import java.util.List;

/**
 * created by 2019
 */
public interface BrandInnerService {

    ObjectResponse<List<InnerBrand>> getAllUnDelete();
}
