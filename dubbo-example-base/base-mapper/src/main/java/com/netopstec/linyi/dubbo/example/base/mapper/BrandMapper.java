package com.netopstec.linyi.dubbo.example.base.mapper;


import com.netopstec.linyi.dubbo.example.base.entity.Brand;

import java.util.List;

/**
 * create by 2019
 */
public interface BrandMapper {

    Brand selectOneById(Long id);

    List<Brand> selectAll();
}
