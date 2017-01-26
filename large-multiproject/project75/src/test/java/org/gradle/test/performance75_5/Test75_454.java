package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_454 {
    private final Production75_454 production = new Production75_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}