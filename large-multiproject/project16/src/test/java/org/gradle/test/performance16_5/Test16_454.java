package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_454 {
    private final Production16_454 production = new Production16_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}