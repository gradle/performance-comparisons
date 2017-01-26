package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_454 {
    private final Production94_454 production = new Production94_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}