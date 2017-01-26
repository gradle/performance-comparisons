package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_242 {
    private final Production76_242 production = new Production76_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}