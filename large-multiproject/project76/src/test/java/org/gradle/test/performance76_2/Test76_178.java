package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_178 {
    private final Production76_178 production = new Production76_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}