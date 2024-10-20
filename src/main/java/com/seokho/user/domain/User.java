package com.seokho.user.domain;

import java.util.Objects;

public class User {

    private final Long id;
    private final UserInfo info;
    private final UserRelationCounter followingCount;
    private final UserRelationCounter followorCounter;

    public User (Long id, UserInfo userInfo) {
        this.id = id;
        this.info =userInfo;
        this.followingCount = new UserRelationCounter();
        this.followorCounter = new UserRelationCounter();
    }
    public void follow(User targetUser){
        if (targetUser.equals(this)){
            throw new IllegalArgumentException();
        }
        followingCount.increase();
        targetUser.increaseFollowerCount();

    }



    public void unfollow(User targetUser){
        if (this.equals(targetUser)){
            throw new IllegalArgumentException();
        }

        followingCount.decrease();
        targetUser.decreaseFollowerCount();
    }


    private void increaseFollowerCount(){
        followorCounter.increase();
    }

    private void decreaseFollowerCount(){
        followorCounter.decrease();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
