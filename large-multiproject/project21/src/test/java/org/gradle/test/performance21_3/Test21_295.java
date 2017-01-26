package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_295 {
    private final Production21_295 production = new Production21_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}