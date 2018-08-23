package org.edi.freamwork.httpclient;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.HttpClient;

/**
 * @author Fancy
 * @date 2018/8/20
 */
public class HttpRequest {
    private static final String url = "http://login3.avacloud.com.cn:9091/edi.businessone_Web/v1/documents";
    public static String post(String requestJson) throws Exception {
        try{
            HttpClient httpClient = HttpClientBuilder.create().build();
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(10000).setConnectionRequestTimeout(5000)
                    .setSocketTimeout(10000).build();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            Gson gson = new Gson();
            HttpResponse httpResponse;
            httpPost.addHeader("content-type", "application/json;charset=utf-8");
            httpPost.addHeader("Accept", "application/json;charset=utf-8");

            StringEntity entity = new StringEntity(requestJson);
            httpPost.setEntity(entity);
            //httpClient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
            httpResponse = httpClient.execute(httpPost);
            String response = EntityUtils.toString(httpResponse.getEntity());
            return response;
        }catch (Exception e){
            throw e;
        }
    }
}
