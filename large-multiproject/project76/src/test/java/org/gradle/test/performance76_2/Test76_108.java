package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_108 {
    private final Production76_108 production = new Production76_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}