package com.solvd.carina.demo.api;


import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.api_url}/products/add", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/products/_post/rq.json")
@ResponseTemplatePath(path = "api/products/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostProduct extends AbstractApiMethodV2 {
    public PostProduct() {
    }
}
