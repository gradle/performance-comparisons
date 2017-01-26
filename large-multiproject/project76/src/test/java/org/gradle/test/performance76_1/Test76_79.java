package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_79 {
    private final Production76_79 production = new Production76_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}