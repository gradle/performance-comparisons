package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_291 {
    private final Production21_291 production = new Production21_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}