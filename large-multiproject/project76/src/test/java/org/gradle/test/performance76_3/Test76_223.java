package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_223 {
    private final Production76_223 production = new Production76_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}