package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_301 {
    private final Production76_301 production = new Production76_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}