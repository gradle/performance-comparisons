package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_454 {
    private final Production47_454 production = new Production47_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}