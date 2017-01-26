package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_170 {
    private final Production76_170 production = new Production76_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}