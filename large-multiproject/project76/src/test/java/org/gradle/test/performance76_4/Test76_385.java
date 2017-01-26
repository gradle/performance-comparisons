package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_385 {
    private final Production76_385 production = new Production76_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}