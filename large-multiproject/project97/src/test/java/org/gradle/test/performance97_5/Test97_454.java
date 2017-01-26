package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_454 {
    private final Production97_454 production = new Production97_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}