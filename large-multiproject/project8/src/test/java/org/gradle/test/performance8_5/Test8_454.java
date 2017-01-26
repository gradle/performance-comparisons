package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_454 {
    private final Production8_454 production = new Production8_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}