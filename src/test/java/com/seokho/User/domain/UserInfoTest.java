package com.seokho.User.domain;

import com.seokho.common.domain.PositivenIntegerCounter;
import com.seokho.user.domain.User;
import com.seokho.user.domain.UserInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoTest {

    @Test
    void givennameAndProfileimage_whenCreated_thenThrowNothing(){
        //given
        String name = "abce";
        String profileImageUrl ="";

        //when


        //then
        assertDoesNotThrow(()-> new UserInfo(name,profileImageUrl));

    }

    @Test
    void  givenBlanknameAndProfileimage_whenCreated_thenThrowError(){
        //given
        String name = "";
        String profileImageUrl ="";

        //when
        //then
        assertThrows(IllegalArgumentException.class,() ->new UserInfo(name,profileImageUrl));
    }

}
