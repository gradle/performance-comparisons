package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_375 {
    private final Production76_375 production = new Production76_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}