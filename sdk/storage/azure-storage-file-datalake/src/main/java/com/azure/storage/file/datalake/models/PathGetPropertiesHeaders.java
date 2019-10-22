// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for GetProperties operation.
 */
@Fluent
public final class PathGetPropertiesHeaders {
    /*
     * Indicates that the service supports requests for partial file content.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /*
     * If the Cache-Control request header has previously been set for the
     * resource, that value is returned in this header.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * If the Content-Disposition request header has previously been set for
     * the resource, that value is returned in this header.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * If the Content-Encoding request header has previously been set for the
     * resource, that value is returned in this header.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * If the Content-Language request header has previously been set for the
     * resource, that value is returned in this header.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * The size of the resource in bytes.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * Indicates the range of bytes returned in the event that the client
     * requested a subset of the file by setting the Range request header.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /*
     * The content type specified for the resource. If no content type was
     * specified, the default content type is application/octet-stream.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * The MD5 hash of complete file stored in storage. This header is returned
     * only for "GetProperties" operation. If the Content-MD5 header has been
     * set for the file, this response header is returned for GetProperties
     * call so that the client can check for message content integrity.
     */
    @JsonProperty(value = "Content-MD5")
    private String contentMD5;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private String dateProperty;

    /*
     * An HTTP entity tag associated with the file or directory.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The data and time the file or directory was last modified.  Write
     * operations on the file or directory update the last modified time.
     */
    @JsonProperty(value = "Last-Modified")
    private String lastModified;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The type of the resource.  The value may be "file" or "directory".  If
     * not set, the value is "file".
     */
    @JsonProperty(value = "x-ms-resource-type")
    private String xMsResourceType;

    /*
     * The user-defined properties associated with the file or directory, in
     * the format of a comma-separated list of name and value pairs "n1=v1,
     * n2=v2, ...", where each value is a base64 encoded string. Note that the
     * string may only contain ASCII characters in the ISO-8859-1 character
     * set.
     */
    @JsonProperty(value = "x-ms-properties")
    private String xMsProperties;

    /*
     * The owner of the file or directory. Included in the response if
     * Hierarchical Namespace is enabled for the account.
     */
    @JsonProperty(value = "x-ms-owner")
    private String xMsOwner;

    /*
     * The owning group of the file or directory. Included in the response if
     * Hierarchical Namespace is enabled for the account.
     */
    @JsonProperty(value = "x-ms-group")
    private String xMsGroup;

    /*
     * The POSIX access permissions for the file owner, the file owning group,
     * and others. Included in the response if Hierarchical Namespace is
     * enabled for the account.
     */
    @JsonProperty(value = "x-ms-permissions")
    private String xMsPermissions;

    /*
     * The POSIX access control list for the file or directory.  Included in
     * the response only if the action is "getAccessControl" and Hierarchical
     * Namespace is enabled for the account.
     */
    @JsonProperty(value = "x-ms-acl")
    private String xMsAcl;

    /*
     * When a resource is leased, specifies whether the lease is of infinite or
     * fixed duration.
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private String xMsLeaseDuration;

    /*
     * Lease state of the resource.
     */
    @JsonProperty(value = "x-ms-lease-state")
    private String xMsLeaseState;

    /*
     * The lease status of the resource.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private String xMsLeaseStatus;

    /**
     * Get the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the cacheControl property: If the Cache-Control request header has
     * previously been set for the resource, that value is returned in this
     * header.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: If the Cache-Control request header has
     * previously been set for the resource, that value is returned in this
     * header.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentDisposition property: If the Content-Disposition request
     * header has previously been set for the resource, that value is returned
     * in this header.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: If the Content-Disposition request
     * header has previously been set for the resource, that value is returned
     * in this header.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentEncoding property: If the Content-Encoding request header
     * has previously been set for the resource, that value is returned in this
     * header.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: If the Content-Encoding request header
     * has previously been set for the resource, that value is returned in this
     * header.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentLanguage property: If the Content-Language request header
     * has previously been set for the resource, that value is returned in this
     * header.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: If the Content-Language request header
     * has previously been set for the resource, that value is returned in this
     * header.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the contentLength property: The size of the resource in bytes.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The size of the resource in bytes.
     *
     * @param contentLength the contentLength value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentRange property: Indicates the range of bytes returned in
     * the event that the client requested a subset of the file by setting the
     * Range request header.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: Indicates the range of bytes returned in
     * the event that the client requested a subset of the file by setting the
     * Range request header.
     *
     * @param contentRange the contentRange value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the contentType property: The content type specified for the
     * resource. If no content type was specified, the default content type is
     * application/octet-stream.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type specified for the
     * resource. If no content type was specified, the default content type is
     * application/octet-stream.
     *
     * @param contentType the contentType value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentMD5 property: The MD5 hash of complete file stored in
     * storage. This header is returned only for "GetProperties" operation. If
     * the Content-MD5 header has been set for the file, this response header
     * is returned for GetProperties call so that the client can check for
     * message content integrity.
     *
     * @return the contentMD5 value.
     */
    public String getContentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 property: The MD5 hash of complete file stored in
     * storage. This header is returned only for "GetProperties" operation. If
     * the Content-MD5 header has been set for the file, this response header
     * is returned for GetProperties call so that the client can check for
     * message content integrity.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public String getDateProperty() {
        return this.dateProperty;
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setDateProperty(String dateProperty) {
        this.dateProperty = dateProperty;
        return this;
    }

    /**
     * Get the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @param eTag the eTag value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The data and time the file or directory
     * was last modified.  Write operations on the file or directory update the
     * last modified time.
     *
     * @return the lastModified value.
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified property: The data and time the file or directory
     * was last modified.  Write operations on the file or directory update the
     * last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the xMsRequestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsVersion property: The version of the REST protocol used to
     * process the request.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The version of the REST protocol used to
     * process the request.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsResourceType property: The type of the resource.  The value
     * may be "file" or "directory".  If not set, the value is "file".
     *
     * @return the xMsResourceType value.
     */
    public String getXMsResourceType() {
        return this.xMsResourceType;
    }

    /**
     * Set the xMsResourceType property: The type of the resource.  The value
     * may be "file" or "directory".  If not set, the value is "file".
     *
     * @param xMsResourceType the xMsResourceType value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsResourceType(String xMsResourceType) {
        this.xMsResourceType = xMsResourceType;
        return this;
    }

    /**
     * Get the xMsProperties property: The user-defined properties associated
     * with the file or directory, in the format of a comma-separated list of
     * name and value pairs "n1=v1, n2=v2, ...", where each value is a base64
     * encoded string. Note that the string may only contain ASCII characters
     * in the ISO-8859-1 character set.
     *
     * @return the xMsProperties value.
     */
    public String getXMsProperties() {
        return this.xMsProperties;
    }

    /**
     * Set the xMsProperties property: The user-defined properties associated
     * with the file or directory, in the format of a comma-separated list of
     * name and value pairs "n1=v1, n2=v2, ...", where each value is a base64
     * encoded string. Note that the string may only contain ASCII characters
     * in the ISO-8859-1 character set.
     *
     * @param xMsProperties the xMsProperties value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsProperties(String xMsProperties) {
        this.xMsProperties = xMsProperties;
        return this;
    }

    /**
     * Get the xMsOwner property: The owner of the file or directory. Included
     * in the response if Hierarchical Namespace is enabled for the account.
     *
     * @return the xMsOwner value.
     */
    public String getXMsOwner() {
        return this.xMsOwner;
    }

    /**
     * Set the xMsOwner property: The owner of the file or directory. Included
     * in the response if Hierarchical Namespace is enabled for the account.
     *
     * @param xMsOwner the xMsOwner value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsOwner(String xMsOwner) {
        this.xMsOwner = xMsOwner;
        return this;
    }

    /**
     * Get the xMsGroup property: The owning group of the file or directory.
     * Included in the response if Hierarchical Namespace is enabled for the
     * account.
     *
     * @return the xMsGroup value.
     */
    public String getXMsGroup() {
        return this.xMsGroup;
    }

    /**
     * Set the xMsGroup property: The owning group of the file or directory.
     * Included in the response if Hierarchical Namespace is enabled for the
     * account.
     *
     * @param xMsGroup the xMsGroup value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsGroup(String xMsGroup) {
        this.xMsGroup = xMsGroup;
        return this;
    }

    /**
     * Get the xMsPermissions property: The POSIX access permissions for the
     * file owner, the file owning group, and others. Included in the response
     * if Hierarchical Namespace is enabled for the account.
     *
     * @return the xMsPermissions value.
     */
    public String getXMsPermissions() {
        return this.xMsPermissions;
    }

    /**
     * Set the xMsPermissions property: The POSIX access permissions for the
     * file owner, the file owning group, and others. Included in the response
     * if Hierarchical Namespace is enabled for the account.
     *
     * @param xMsPermissions the xMsPermissions value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsPermissions(String xMsPermissions) {
        this.xMsPermissions = xMsPermissions;
        return this;
    }

    /**
     * Get the xMsAcl property: The POSIX access control list for the file or
     * directory.  Included in the response only if the action is
     * "getAccessControl" and Hierarchical Namespace is enabled for the
     * account.
     *
     * @return the xMsAcl value.
     */
    public String getXMsAcl() {
        return this.xMsAcl;
    }

    /**
     * Set the xMsAcl property: The POSIX access control list for the file or
     * directory.  Included in the response only if the action is
     * "getAccessControl" and Hierarchical Namespace is enabled for the
     * account.
     *
     * @param xMsAcl the xMsAcl value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsAcl(String xMsAcl) {
        this.xMsAcl = xMsAcl;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: When a resource is leased, specifies
     * whether the lease is of infinite or fixed duration.
     *
     * @return the xMsLeaseDuration value.
     */
    public String getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: When a resource is leased, specifies
     * whether the lease is of infinite or fixed duration.
     *
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsLeaseDuration(String xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the xMsLeaseState property: Lease state of the resource.
     *
     * @return the xMsLeaseState value.
     */
    public String getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: Lease state of the resource.
     *
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsLeaseState(String xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
        return this;
    }

    /**
     * Get the xMsLeaseStatus property: The lease status of the resource.
     *
     * @return the xMsLeaseStatus value.
     */
    public String getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The lease status of the resource.
     *
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the PathGetPropertiesHeaders object itself.
     */
    public PathGetPropertiesHeaders setXMsLeaseStatus(String xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
        return this;
    }
}