package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_254 {
    private final Production76_254 production = new Production76_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}