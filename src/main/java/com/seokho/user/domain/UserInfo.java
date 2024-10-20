package com.seokho.user.domain;

public class UserInfo {

    private final String name;
    private final String profileInageUrl;

    public UserInfo(String name, String profileInageUrl) {

        if(name ==null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.profileInageUrl = profileInageUrl;
    }


}
