package com.example.networks.asyctask;

import android.os.Message;

import com.example.networks.QQContactActivity;
import com.example.networks.bean.HttpReqData;
import com.example.networks.bean.HttpRespData;
import com.example.networks.utils.HttpRequestUtil;

public class QueryFriendTask implements Runnable {
    private String mQueryUrl = ClientThread1.REQUEST_URL + "/QueryFriend"; // 查询好友列表的服务地址

    public QueryFriendTask() {
        super();
    }
    @Override
    public void run() {
        HttpReqData reqData=new HttpReqData(mQueryUrl);
        HttpRespData respData= HttpRequestUtil.postData(reqData);
        String content=respData.content;
        Message msg=Message.obtain();
        msg.obj=content;
        QQContactActivity.jsonHandler.sendMessage(msg);
    }
}
