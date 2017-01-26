package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_454 {
    private final Production25_454 production = new Production25_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}