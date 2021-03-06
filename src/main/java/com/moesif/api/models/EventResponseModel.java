/*
 * MoesifAPILib
 *
 *
 */
package com.moesif.api.models;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.moesif.api.Configuration;

public class EventResponseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5045792952371564693L;
    private Date time;
    private int status;
    private Map<String, String> headers;
    private Object body;
    private String transferEncoding;
    private String ipAddress;
    /** GETTER
     * Time when response received
     * @return the value
     */
    @JsonGetter("time")
    @JsonFormat(pattern = Configuration.DateTimeFormat)
    public Date getTime ( ) { 
        return this.time;
    }
    
    /** SETTER
     * Time when response received
     * @param value the value to set
     */
    @JsonSetter("time")
    public void setTime (Date value) { 
        this.time = value;
    }
 
    /** GETTER
     * HTTP Status code such as 200
     * @return the value
     */
    @JsonGetter("status")
    public int getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * HTTP Status code such as 200
     * @param value the value to set
     */
    @JsonSetter("status")
    public void setStatus (int value) { 
        this.status = value;
    }
 
    /** GETTER
     * Key/Value map of response headers
     * @return the value
     */
    @JsonGetter("headers")
    public Map<String, String> getHeaders ( ) {
        return this.headers;
    }
    
    /** SETTER
     * Key/Value map of response headers
     * @param value the value to set
     */
    @JsonSetter("headers")
    public void setHeaders (Map<String, String> value) {
        this.headers = value;
    }
 
    /** GETTER
     * Response body
     * @return the value
     */
    @JsonGetter("body")
    public Object getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Response body
     * @param value the value to set
     */
    @JsonSetter("body")
    public void setBody (Object value) { 
        this.body = value;
    }

    /** GETTER
     * Transfer Encoding of the body such as "base64", null value implies "json" transfer encoding
     * @return the value
     */
    @JsonGetter("transfer_encoding")
    public String getTransferEncoding ( ) {
        return this.transferEncoding;
    }

    /** SETTER
     * Transfer Encoding of the body such as "base64", null value implies "json" transfer encoding
     * @param value the value to set
     */
    @JsonSetter("transfer_encoding")
    public void setTransferEncoding (String value) {
        this.transferEncoding = value;
    }
 
    /** GETTER
     * IP Address from the response, such as the server IP Address
     * @return the value
     */
    @JsonGetter("ip_address")
    public String getIpAddress ( ) { 
        return this.ipAddress;
    }
    
    /** SETTER
     * IP Address from the response, such as the server IP Address
     * @param value the value to set
     */
    @JsonSetter("ip_address")
    public void setIpAddress (String value) { 
        this.ipAddress = value;
    }
 
}
 