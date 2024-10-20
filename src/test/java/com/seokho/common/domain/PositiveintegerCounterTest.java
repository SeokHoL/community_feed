package com.seokho.common.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveintegerCounterTest {

    @Test
    void givenCreated_whenIncrease_thenCountInsOne(){
        //given
        PositivenIntegerCounter counter = new PositivenIntegerCounter();

        //when
        counter.increase();

        //then
        assertEquals(1, counter.getCount());
    }

    @Test
    void givenCreatedAndIncreased_whenDecrease_thenCountIsZero(){
        //given
        PositivenIntegerCounter counter = new PositivenIntegerCounter();
        counter.increase();
        //when
        counter.decrease();

        //then
        assertEquals(0, counter.getCount());

    }

    @Test
    void givenCreated_whenDecrease_thenCountIsZero(){
        //given
        PositivenIntegerCounter counter = new PositivenIntegerCounter();

        //when
        counter.decrease();

        //then
        assertEquals(0, counter.getCount());
    }
}
