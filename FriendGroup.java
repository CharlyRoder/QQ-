package com.example.networks.bean;

import java.util.ArrayList;

/**
 * 好友分组列表
 * 分组名
 * 好友列表
 */
public class FriendGroup {
    public String group_title;
    public ArrayList<Friend> friend_list;


    public FriendGroup() {
        this.group_title = "";
        this.friend_list = new ArrayList<Friend>();
    }

    public FriendGroup(String group_title, ArrayList<Friend> friend_list) {
        this.group_title = group_title;
        this.friend_list = friend_list;
    }

    public String getGroup_title() {
        return group_title;
    }

    public void setGroup_title(String group_title) {
        this.group_title = group_title;
    }

    public ArrayList<Friend> getFriend_list() {
        return friend_list;
    }

    public void setFriend_list(ArrayList<Friend> friend_list) {
        this.friend_list = friend_list;
    }
}
