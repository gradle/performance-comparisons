package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_232 {
    private final Production76_232 production = new Production76_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}