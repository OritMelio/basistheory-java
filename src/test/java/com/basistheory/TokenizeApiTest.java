/*
 * Basis Theory API
 * ## Getting Started * Sign-in to [Basis Theory](https://basistheory.com) and go to [Applications](https://portal.basistheory.com/applications) * Create a Basis Theory Private Application * All permissions should be selected * Paste the API Key into the `BT-API-KEY` variable
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.basistheory;

import com.basistheory.ApiException;
import com.basistheory.ProblemDetails;
import com.basistheory.ValidationProblemDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenizeApi
 */
@Disabled
public class TokenizeApiTest {

    private final TokenizeApi api = new TokenizeApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenizeTest() throws ApiException {
        Object body = null;
        Object response = api.tokenize(body);
        // TODO: test validations
    }

}
