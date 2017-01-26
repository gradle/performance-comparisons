package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_233 {
    private final Production21_233 production = new Production21_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}