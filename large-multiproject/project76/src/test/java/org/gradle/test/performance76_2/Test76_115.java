package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_115 {
    private final Production76_115 production = new Production76_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}