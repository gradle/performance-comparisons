package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_211 {
    private final Production21_211 production = new Production21_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}