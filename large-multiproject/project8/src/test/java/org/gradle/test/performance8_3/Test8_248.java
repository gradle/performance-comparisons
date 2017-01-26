package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_248 {
    private final Production8_248 production = new Production8_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}