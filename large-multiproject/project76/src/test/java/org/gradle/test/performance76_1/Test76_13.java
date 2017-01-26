package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_13 {
    private final Production76_13 production = new Production76_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}