package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_298 {
    private final Production76_298 production = new Production76_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}