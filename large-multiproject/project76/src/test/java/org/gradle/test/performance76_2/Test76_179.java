package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_179 {
    private final Production76_179 production = new Production76_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}