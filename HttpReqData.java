package com.example.networks.bean;

public class HttpReqData {//请求数据
        public String url;
        public String cookie;
        public String referer;
        public String content_type;
        public String x_requested_with;
        public StringBuffer params;
        public String charset;
        public String boundary;

        public HttpReqData() {
            url = "";
            cookie = "";
            referer = "";
            content_type = "";
            x_requested_with = "";
            params = new StringBuffer();
            charset = "utf-8";
            boundary = "";
        }
    public HttpReqData(String url) {
        this();
        this.url = url;
    }

    public HttpReqData(String url, String cookie, String referer, String content_type, String x_requested_with, StringBuffer params, String charset, String boundary) {
        this.url = url;
        this.cookie = cookie;
        this.referer = referer;
        this.content_type = content_type;
        this.x_requested_with = x_requested_with;
        this.params = params;
        this.charset = charset;
        this.boundary = boundary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getX_requested_with() {
        return x_requested_with;
    }

    public void setX_requested_with(String x_requested_with) {
        this.x_requested_with = x_requested_with;
    }

    public StringBuffer getParams() {
        return params;
    }

    public void setParams(StringBuffer params) {
        this.params = params;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getBoundary() {
        return boundary;
    }

    public void setBoundary(String boundary) {
        this.boundary = boundary;
    }
}
