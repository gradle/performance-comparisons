package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_372 {
    private final Production76_372 production = new Production76_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}