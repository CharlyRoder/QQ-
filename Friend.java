package com.example.networks.bean;

/**
 * QQ好友信息，设备id，昵称，登录时间
 */
public class Friend {
    public String device_id;
    public String nickname;
    public String login_time;

    public Friend() {
    }

    public Friend(String device_id, String nickname, String login_time) {
        this.device_id = device_id;
        this.nickname = nickname;
        this.login_time = login_time;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLogin_time() {
        return login_time;
    }

    public void setLogin_time(String login_time) {
        this.login_time = login_time;
    }
}
