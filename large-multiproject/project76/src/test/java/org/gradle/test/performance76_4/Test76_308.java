package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_308 {
    private final Production76_308 production = new Production76_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}