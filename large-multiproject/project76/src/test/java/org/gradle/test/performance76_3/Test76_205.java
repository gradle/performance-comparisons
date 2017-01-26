package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_205 {
    private final Production76_205 production = new Production76_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}