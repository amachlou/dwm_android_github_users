package com.machlou.dwm_java.dwm_android_github_users.model;

import com.google.gson.annotations.SerializedName;
import com.machlou.dwm_java.dwm_android_github_users.model.GitUser;

import java.util.ArrayList;
import java.util.List;

public class GitUsersResponse {
    @SerializedName("total_count")
    public int totalCount;
    @SerializedName("items")
    public List<GitUser> users=new ArrayList<>();
}
