package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_409 {
    private final Production76_409 production = new Production76_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}