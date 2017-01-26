package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_258 {
    private final Production76_258 production = new Production76_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}