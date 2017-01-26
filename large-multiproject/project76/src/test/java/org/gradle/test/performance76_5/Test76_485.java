package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_485 {
    private final Production76_485 production = new Production76_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}