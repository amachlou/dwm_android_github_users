package com.machlou.dwm_java.dwm_android_github_users.model;

import com.google.gson.annotations.SerializedName;

public class GitUser {
    public int id;
    public String login;
    @SerializedName("avatar_url")
    public String avatarUrl;
    public int score;
}
