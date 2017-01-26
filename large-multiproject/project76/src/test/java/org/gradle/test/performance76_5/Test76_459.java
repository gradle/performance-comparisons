package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_459 {
    private final Production76_459 production = new Production76_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}