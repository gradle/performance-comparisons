package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_399 {
    private final Production76_399 production = new Production76_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}