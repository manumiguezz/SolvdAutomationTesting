package com.solvd.carina.demo;

import com.solvd.carina.demo.api.DeleteProductById;
import com.solvd.carina.demo.api.GetProductById;
import com.solvd.carina.demo.api.PostProduct;
import com.solvd.carina.demo.api.PutProduct;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;


public class ProductTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "manumiguezz")
    public void getProductByIdTest(){
        GetProductById api = new GetProductById();
        api.setId(1);
        api.callAPIExpectSuccess();
        api.validateResponseAgainstSchema("api/products/_get/rs.json");
    }

    @Test
    @MethodOwner(owner = "manumiguezz")
    public void deleteProductTest(){
        DeleteProductById api = new DeleteProductById();
        api.setId(1);
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT_ORDER);
    }

    @Test
    @MethodOwner(owner = "manumiguezz")
    public void postProductTest(){
        PostProduct api = new PostProduct();
        api.callAPIExpectSuccess();
        api.validateResponse();
        api.validateResponseAgainstSchema("api/products/_post/rs.json");
    }

    @Test
    @MethodOwner(owner = "manumiguezz")
    public void putProductTest(){
        PutProduct api = new PutProduct();
        api.setId(1);
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT_ORDER);
        api.validateResponseAgainstSchema("api/products/_put/rs.schema");
    }

}
