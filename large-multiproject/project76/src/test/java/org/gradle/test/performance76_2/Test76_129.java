package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_129 {
    private final Production76_129 production = new Production76_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}