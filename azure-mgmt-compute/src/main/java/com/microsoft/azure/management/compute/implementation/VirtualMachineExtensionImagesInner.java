/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineExtensionImages.
 */
public final class VirtualMachineExtensionImagesInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineExtensionImagesService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineExtensionImagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineExtensionImagesInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(VirtualMachineExtensionImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineExtensionImages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineExtensionImagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineExtensionImages get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types/{type}/versions/{version}")
        Observable<Response<ResponseBody>> get(@Path("location") String location, @Path("publisherName") String publisherName, @Path("type") String type, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineExtensionImages listTypes" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types")
        Observable<Response<ResponseBody>> listTypes(@Path("location") String location, @Path("publisherName") String publisherName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineExtensionImages listVersions" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types/{type}/versions")
        Observable<Response<ResponseBody>> listVersions(@Path("location") String location, @Path("publisherName") String publisherName, @Path("type") String type, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("$orderby") String orderby, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @return the VirtualMachineExtensionImageInner object if successful.
     */
    public VirtualMachineExtensionImageInner get(String location, String publisherName, String type, String version) {
        return getWithServiceResponseAsync(location, publisherName, type, version).toBlocking().single().getBody();
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<VirtualMachineExtensionImageInner> getAsync(String location, String publisherName, String type, String version, final ServiceCallback<VirtualMachineExtensionImageInner> serviceCallback) {
        return ServiceCall.fromResponse(getWithServiceResponseAsync(location, publisherName, type, version), serviceCallback);
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @return the observable to the VirtualMachineExtensionImageInner object
     */
    public Observable<VirtualMachineExtensionImageInner> getAsync(String location, String publisherName, String type, String version) {
        return getWithServiceResponseAsync(location, publisherName, type, version).map(new Func1<ServiceResponse<VirtualMachineExtensionImageInner>, VirtualMachineExtensionImageInner>() {
            @Override
            public VirtualMachineExtensionImageInner call(ServiceResponse<VirtualMachineExtensionImageInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @return the observable to the VirtualMachineExtensionImageInner object
     */
    public Observable<ServiceResponse<VirtualMachineExtensionImageInner>> getWithServiceResponseAsync(String location, String publisherName, String type, String version) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Parameter version is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(location, publisherName, type, version, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VirtualMachineExtensionImageInner>>>() {
                @Override
                public Observable<ServiceResponse<VirtualMachineExtensionImageInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VirtualMachineExtensionImageInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VirtualMachineExtensionImageInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VirtualMachineExtensionImageInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VirtualMachineExtensionImageInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @return the List&lt;VirtualMachineExtensionImageInner&gt; object if successful.
     */
    public List<VirtualMachineExtensionImageInner> listTypes(String location, String publisherName) {
        return listTypesWithServiceResponseAsync(location, publisherName).toBlocking().single().getBody();
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<VirtualMachineExtensionImageInner>> listTypesAsync(String location, String publisherName, final ServiceCallback<List<VirtualMachineExtensionImageInner>> serviceCallback) {
        return ServiceCall.fromResponse(listTypesWithServiceResponseAsync(location, publisherName), serviceCallback);
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @return the observable to the List&lt;VirtualMachineExtensionImageInner&gt; object
     */
    public Observable<List<VirtualMachineExtensionImageInner>> listTypesAsync(String location, String publisherName) {
        return listTypesWithServiceResponseAsync(location, publisherName).map(new Func1<ServiceResponse<List<VirtualMachineExtensionImageInner>>, List<VirtualMachineExtensionImageInner>>() {
            @Override
            public List<VirtualMachineExtensionImageInner> call(ServiceResponse<List<VirtualMachineExtensionImageInner>> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @return the observable to the List&lt;VirtualMachineExtensionImageInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>> listTypesWithServiceResponseAsync(String location, String publisherName) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listTypes(location, publisherName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<VirtualMachineExtensionImageInner>> clientResponse = listTypesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<VirtualMachineExtensionImageInner>> listTypesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<VirtualMachineExtensionImageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<VirtualMachineExtensionImageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @return the List&lt;VirtualMachineExtensionImageInner&gt; object if successful.
     */
    public List<VirtualMachineExtensionImageInner> listVersions(String location, String publisherName, String type) {
        return listVersionsWithServiceResponseAsync(location, publisherName, type).toBlocking().single().getBody();
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<VirtualMachineExtensionImageInner>> listVersionsAsync(String location, String publisherName, String type, final ServiceCallback<List<VirtualMachineExtensionImageInner>> serviceCallback) {
        return ServiceCall.fromResponse(listVersionsWithServiceResponseAsync(location, publisherName, type), serviceCallback);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @return the observable to the List&lt;VirtualMachineExtensionImageInner&gt; object
     */
    public Observable<List<VirtualMachineExtensionImageInner>> listVersionsAsync(String location, String publisherName, String type) {
        return listVersionsWithServiceResponseAsync(location, publisherName, type).map(new Func1<ServiceResponse<List<VirtualMachineExtensionImageInner>>, List<VirtualMachineExtensionImageInner>>() {
            @Override
            public List<VirtualMachineExtensionImageInner> call(ServiceResponse<List<VirtualMachineExtensionImageInner>> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @return the observable to the List&lt;VirtualMachineExtensionImageInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>> listVersionsWithServiceResponseAsync(String location, String publisherName, String type) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        return service.listVersions(location, publisherName, type, this.client.subscriptionId(), filter, top, orderby, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<VirtualMachineExtensionImageInner>> clientResponse = listVersionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @return the List&lt;VirtualMachineExtensionImageInner&gt; object if successful.
     */
    public List<VirtualMachineExtensionImageInner> listVersions(String location, String publisherName, String type, String filter, Integer top, String orderby) {
        return listVersionsWithServiceResponseAsync(location, publisherName, type, filter, top, orderby).toBlocking().single().getBody();
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<VirtualMachineExtensionImageInner>> listVersionsAsync(String location, String publisherName, String type, String filter, Integer top, String orderby, final ServiceCallback<List<VirtualMachineExtensionImageInner>> serviceCallback) {
        return ServiceCall.fromResponse(listVersionsWithServiceResponseAsync(location, publisherName, type, filter, top, orderby), serviceCallback);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @return the observable to the List&lt;VirtualMachineExtensionImageInner&gt; object
     */
    public Observable<List<VirtualMachineExtensionImageInner>> listVersionsAsync(String location, String publisherName, String type, String filter, Integer top, String orderby) {
        return listVersionsWithServiceResponseAsync(location, publisherName, type, filter, top, orderby).map(new Func1<ServiceResponse<List<VirtualMachineExtensionImageInner>>, List<VirtualMachineExtensionImageInner>>() {
            @Override
            public List<VirtualMachineExtensionImageInner> call(ServiceResponse<List<VirtualMachineExtensionImageInner>> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @return the observable to the List&lt;VirtualMachineExtensionImageInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>> listVersionsWithServiceResponseAsync(String location, String publisherName, String type, String filter, Integer top, String orderby) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listVersions(location, publisherName, type, this.client.subscriptionId(), filter, top, orderby, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineExtensionImageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<VirtualMachineExtensionImageInner>> clientResponse = listVersionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<VirtualMachineExtensionImageInner>> listVersionsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<VirtualMachineExtensionImageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<VirtualMachineExtensionImageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
