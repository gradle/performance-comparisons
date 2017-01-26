package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_429 {
    private final Production76_429 production = new Production76_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}