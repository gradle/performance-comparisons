package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_454 {
    private final Production5_454 production = new Production5_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}