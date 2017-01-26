package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_250 {
    private final Production76_250 production = new Production76_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}