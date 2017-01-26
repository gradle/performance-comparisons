package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_319 {
    private final Production8_319 production = new Production8_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}