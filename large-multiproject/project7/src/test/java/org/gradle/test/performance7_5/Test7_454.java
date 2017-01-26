package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_454 {
    private final Production7_454 production = new Production7_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}