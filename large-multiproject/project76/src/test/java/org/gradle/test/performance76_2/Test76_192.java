package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_192 {
    private final Production76_192 production = new Production76_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}