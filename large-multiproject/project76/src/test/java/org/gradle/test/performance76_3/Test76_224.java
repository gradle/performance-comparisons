package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_224 {
    private final Production76_224 production = new Production76_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}