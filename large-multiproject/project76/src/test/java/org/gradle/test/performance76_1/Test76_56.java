package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_56 {
    private final Production76_56 production = new Production76_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}