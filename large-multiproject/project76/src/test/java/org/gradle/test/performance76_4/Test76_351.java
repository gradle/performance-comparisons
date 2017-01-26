package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_351 {
    private final Production76_351 production = new Production76_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}