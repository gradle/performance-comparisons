package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_236 {
    private final Production76_236 production = new Production76_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}