package com.netopstec.linyi.dubbo.example.test.provider.filter;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import lombok.extern.log4j.Log4j;

/**
 * 接口调用验证 inner unInner 的接口都会走
 */
@Log4j
public class IdentityFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        log.error("identityFilter --------------------- start");

        // 身份认证得业务处理， du'b'bo是服务之间得调用，不需要验证

        log.error("identityFilter --------------------- end");
        return invoker.invoke(invocation);
    }
}
