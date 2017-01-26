package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_273 {
    private final Production76_273 production = new Production76_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}