package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_245 {
    private final Production21_245 production = new Production21_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}