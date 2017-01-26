package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_189 {
    private final Production76_189 production = new Production76_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}