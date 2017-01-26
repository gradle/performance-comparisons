package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_226 {
    private final Production76_226 production = new Production76_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}