package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_454 {
    private final Production83_454 production = new Production83_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}