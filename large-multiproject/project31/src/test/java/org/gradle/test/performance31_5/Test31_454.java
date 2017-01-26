package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_454 {
    private final Production31_454 production = new Production31_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}