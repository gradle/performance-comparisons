package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_454 {
    private final Production93_454 production = new Production93_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}