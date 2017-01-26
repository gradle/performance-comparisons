package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_410 {
    private final Production76_410 production = new Production76_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}