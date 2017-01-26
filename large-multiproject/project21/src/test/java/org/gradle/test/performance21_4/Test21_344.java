package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_344 {
    private final Production21_344 production = new Production21_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}