package com.netopstec.linyi.dubbo.example.base.service.imp;

import com.netopstec.linyi.dubbo.example.api.ListResponse;
import com.netopstec.linyi.dubbo.example.api.ObjectResponse;
import com.netopstec.linyi.dubbo.example.base.api.BrandGetAllRequest;
import com.netopstec.linyi.dubbo.example.base.api.BrandGetRequest;
import com.netopstec.linyi.dubbo.example.base.entity.Brand;
import com.netopstec.linyi.dubbo.example.base.mapper.BrandMapper;
import com.netopstec.linyi.dubbo.example.base.service.api.BrandService;
import com.netopstec.linyi.dubbo.example.base.service.inner.BrandInnerService;
import com.netopstec.linyi.dubbo.example.entity.InnerBrand;
import lombok.extern.log4j.Log4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("brandService")
@Log4j
public class BrandServiceImp implements BrandService, BrandInnerService {

    @Autowired
    private BrandMapper brandMapper;


    @Override
    public ObjectResponse<Brand> get(BrandGetRequest request) {
        ObjectResponse<Brand> response = new ObjectResponse<>();
        Long id = request.getId();
        try {
            if (id != null && id > 0) {
                Brand brand = brandMapper.selectOneById(id);
                if (brand == null) {
                    throw new Exception("不存在这样品牌");
                }
                response.setValue(brand);
            }
        } catch (Exception e) {
            log.error("error in BrandServiceImp --> get: ", e);
        }
        return response;
    }

    @Override
    public ListResponse getAll(BrandGetAllRequest request) {
        ListResponse<Brand> response = new ListResponse<>();
        try {
            List<Brand> brandList = brandMapper.selectAll();
            response.setValue(brandList);
        } catch (Exception e) {
            log.error("error in BrandServiceImp --> getAll: ", e);
        }
        return response;
    }

    @Override
    public ObjectResponse<List<InnerBrand>> getAllUnDelete() {
        ObjectResponse<List<InnerBrand>> response = new ObjectResponse<>();
        try {
            List<Brand> list = brandMapper.selectAll();
            if (CollectionUtils.isNotEmpty(list)) {
                List<InnerBrand> innerBrands = list.stream().filter(b -> b.getIsDelete() == 0)
                        .map(brand -> {
                            InnerBrand innerBrand = new InnerBrand();
                            BeanUtils.copyProperties(brand, innerBrand);
                            return innerBrand;
                        }).collect(Collectors.toList());
                response.setValue(innerBrands);
            }
        } catch (Exception e) {
            log.error("error in BrandServiceImp --> getAllUnCancel: ", e);
        }
        return response;
    }
}
