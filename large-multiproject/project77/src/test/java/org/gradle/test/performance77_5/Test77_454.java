package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_454 {
    private final Production77_454 production = new Production77_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}