package com.netopstec.linyi.dubbo.example.test.service.api;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.netopstec.linyi.dubbo.example.api.ListResponse;
import com.netopstec.linyi.dubbo.example.test.api.TestGetAllRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * created by 2019
 */
@Path("test")
public interface TestService {

    /***
     * 获取所有entity
     * @param request
     * @return
     */
    @POST
    @Path("all")
    @Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
    ListResponse getAll(TestGetAllRequest request);


    /***
     * 获取所有entity
     * @param request
     * @return
     */
    @POST
    @Path("allBrand")
    @Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
    ListResponse getAllBrand(TestGetAllRequest request);
}
