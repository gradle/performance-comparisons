package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_279 {
    private final Production21_279 production = new Production21_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}