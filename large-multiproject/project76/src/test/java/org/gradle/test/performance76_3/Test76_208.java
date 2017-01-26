package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_208 {
    private final Production76_208 production = new Production76_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}