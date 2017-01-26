package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_284 {
    private final Production76_284 production = new Production76_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}