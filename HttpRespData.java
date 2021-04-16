package com.example.networks.bean;

import android.graphics.Bitmap;

public class HttpRespData {
    public String content;
    public Bitmap bitmap;
    public String cookie;
    public String err_msg;

    public HttpRespData() {
        content = "";
        bitmap = null;
        cookie = "";
        err_msg = "";
    }

    public HttpRespData(String content, Bitmap bitmap, String cookie, String err_msg) {
        this.content = content;
        this.bitmap = bitmap;
        this.cookie = cookie;
        this.err_msg = err_msg;
    }

//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public Bitmap getBitmap() {
//        return bitmap;
//    }
//
//    public void setBitmap(Bitmap bitmap) {
//        this.bitmap = bitmap;
//    }
//
//    public String getCookie() {
//        return cookie;
//    }
//
//    public void setCookie(String cookie) {
//        this.cookie = cookie;
//    }
//
//    public String getErr_msg() {
//        return err_msg;
//    }
//
//    public void setErr_msg(String err_msg) {
//        this.err_msg = err_msg;
//    }
}
