package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_454 {
    private final Production37_454 production = new Production37_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}