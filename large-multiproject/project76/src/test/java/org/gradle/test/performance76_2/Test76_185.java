package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_185 {
    private final Production76_185 production = new Production76_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}