package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_346 {
    private final Production76_346 production = new Production76_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}