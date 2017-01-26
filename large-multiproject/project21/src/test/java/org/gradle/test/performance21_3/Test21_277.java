package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_277 {
    private final Production21_277 production = new Production21_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}