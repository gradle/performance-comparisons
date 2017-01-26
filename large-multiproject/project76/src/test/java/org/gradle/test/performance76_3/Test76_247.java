package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_247 {
    private final Production76_247 production = new Production76_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}