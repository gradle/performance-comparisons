package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_169 {
    private final Production76_169 production = new Production76_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}