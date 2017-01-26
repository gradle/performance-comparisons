package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_275 {
    private final Production76_275 production = new Production76_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}