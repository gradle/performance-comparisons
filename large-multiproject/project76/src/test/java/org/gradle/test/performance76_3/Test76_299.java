package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_299 {
    private final Production76_299 production = new Production76_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}