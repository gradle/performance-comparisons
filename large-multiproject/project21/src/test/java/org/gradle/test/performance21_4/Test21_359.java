package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_359 {
    private final Production21_359 production = new Production21_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}