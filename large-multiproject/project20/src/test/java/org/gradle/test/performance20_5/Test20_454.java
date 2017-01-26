package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_454 {
    private final Production20_454 production = new Production20_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}