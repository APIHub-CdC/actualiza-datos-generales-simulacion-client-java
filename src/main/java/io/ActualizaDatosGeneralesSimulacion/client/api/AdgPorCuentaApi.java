package io.ActualizaDatosGeneralesSimulacion.client.api;

import io.ActualizaDatosGeneralesSimulacion.client.ApiCallback;
import io.ActualizaDatosGeneralesSimulacion.client.ApiClient;
import io.ActualizaDatosGeneralesSimulacion.client.ApiException;
import io.ActualizaDatosGeneralesSimulacion.client.ApiResponse;
import io.ActualizaDatosGeneralesSimulacion.client.Configuration;
import io.ActualizaDatosGeneralesSimulacion.client.Pair;
import io.ActualizaDatosGeneralesSimulacion.client.ProgressRequestBody;
import io.ActualizaDatosGeneralesSimulacion.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.ActualizaDatosGeneralesSimulacion.client.model.Errores;
import io.ActualizaDatosGeneralesSimulacion.client.model.RequestADG;
import io.ActualizaDatosGeneralesSimulacion.client.model.RespuestaADG;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdgPorCuentaApi {
    private ApiClient apiClient;

    public AdgPorCuentaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdgPorCuentaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for porCuentaPost
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param request  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call porCuentaPostCall(String xApiKey, RequestADG request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/por-cuenta";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call porCuentaPostValidateBeforeCall(String xApiKey, RequestADG request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling porCuentaPost(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling porCuentaPost(Async)");
        }
        

        okhttp3.Call call = porCuentaPostCall(xApiKey, request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Actualiza Datos Generales por cuenta
     * 
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param request  (required)
     * @return RespuestaADG
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RespuestaADG porCuentaPost(String xApiKey, RequestADG request) throws ApiException {
        ApiResponse<RespuestaADG> resp = porCuentaPostWithHttpInfo(xApiKey, request);
        return resp.getData();
    }

    /**
     * Actualiza Datos Generales por cuenta
     * 
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param request  (required)
     * @return ApiResponse&lt;RespuestaADG&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RespuestaADG> porCuentaPostWithHttpInfo(String xApiKey, RequestADG request) throws ApiException {
        okhttp3.Call call = porCuentaPostValidateBeforeCall(xApiKey, request, null, null);
        Type localVarReturnType = new TypeToken<RespuestaADG>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Actualiza Datos Generales por cuenta (asynchronously)
     * 
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call porCuentaPostAsync(String xApiKey, RequestADG request, final ApiCallback<RespuestaADG> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = porCuentaPostValidateBeforeCall(xApiKey, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RespuestaADG>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
