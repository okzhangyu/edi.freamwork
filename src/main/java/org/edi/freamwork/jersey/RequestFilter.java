package org.edi.freamwork.jersey;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * @author Fancy
 * @date 2018/6/5
 */
@Provider
@UserRequest
@Priority(Priorities.USER)
public class RequestFilter implements ContainerRequestFilter,ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        //记录请求日志
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        //记录返回日志
    }
}
