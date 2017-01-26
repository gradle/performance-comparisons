package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_389 {
    private final Production76_389 production = new Production76_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}