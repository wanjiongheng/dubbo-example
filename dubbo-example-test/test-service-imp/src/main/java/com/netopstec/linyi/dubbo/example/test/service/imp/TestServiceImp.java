package com.netopstec.linyi.dubbo.example.test.service.imp;

import com.netopstec.linyi.dubbo.example.api.ListResponse;
import com.netopstec.linyi.dubbo.example.api.ObjectResponse;
import com.netopstec.linyi.dubbo.example.base.entity.Brand;
import com.netopstec.linyi.dubbo.example.base.service.inner.BrandInnerService;
import com.netopstec.linyi.dubbo.example.entity.InnerBrand;
import com.netopstec.linyi.dubbo.example.test.api.TestGetAllRequest;
import com.netopstec.linyi.dubbo.example.test.entity.Test;
import com.netopstec.linyi.dubbo.example.test.mapper.TestMapper;
import com.netopstec.linyi.dubbo.example.test.service.api.TestService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Log4j
@Service("testService")
public class TestServiceImp implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private BrandInnerService brandInnerService;


    @Override
    public ListResponse getAll(TestGetAllRequest request) {
        ListResponse<Test> testListResponse = new ListResponse<>();
        List<Test> testList = testMapper.selectAll();
        testListResponse.setValue(testList);
        return testListResponse;
    }

    @Override
    public ListResponse getAllBrand(TestGetAllRequest request) {
        ListResponse<InnerBrand> listResponse = new ListResponse<>();
        ObjectResponse<List<InnerBrand>> response = brandInnerService.getAllUnDelete();
        if (response.isSuccess()) {
            listResponse.setValue(response.getValue());
        }
        return listResponse;
    }


}
