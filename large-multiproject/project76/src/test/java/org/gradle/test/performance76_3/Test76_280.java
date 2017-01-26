package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_280 {
    private final Production76_280 production = new Production76_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}