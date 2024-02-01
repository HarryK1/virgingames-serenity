package com.virgingames.TestBase;

import com.virgingames.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void inIt()
    {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUri");                        //Property Reader always returns String
        RestAssured.basePath = propertyReader.getProperty("basePath");
    }



}
