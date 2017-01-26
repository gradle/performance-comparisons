package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_483 {
    private final Production76_483 production = new Production76_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}