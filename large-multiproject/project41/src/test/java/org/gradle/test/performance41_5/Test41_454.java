package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_454 {
    private final Production41_454 production = new Production41_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}