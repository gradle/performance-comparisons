package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_355 {
    private final Production76_355 production = new Production76_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}