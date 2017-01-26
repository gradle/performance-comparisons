package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_194 {
    private final Production76_194 production = new Production76_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}