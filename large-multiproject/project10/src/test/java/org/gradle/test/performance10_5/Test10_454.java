package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_454 {
    private final Production10_454 production = new Production10_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}