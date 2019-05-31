package com.netopstec.linyi.dubbo.example.base.service.api;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.netopstec.linyi.dubbo.example.api.ListResponse;
import com.netopstec.linyi.dubbo.example.api.ObjectResponse;
import com.netopstec.linyi.dubbo.example.base.api.BrandGetAllRequest;
import com.netopstec.linyi.dubbo.example.base.api.BrandGetRequest;
import com.netopstec.linyi.dubbo.example.base.entity.Brand;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * created by 2019
 */
@Path("brand")
public interface BrandService {

    @POST
    @Path("get")
    @Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
    ObjectResponse<Brand> get(BrandGetRequest request);

    /***
     * 获取所有品牌
     * @param request
     * @return
     */
    @POST
    @Path("all")
    @Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
    ListResponse getAll(BrandGetAllRequest request);
}
