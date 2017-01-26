package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_454 {
    private final Production43_454 production = new Production43_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}