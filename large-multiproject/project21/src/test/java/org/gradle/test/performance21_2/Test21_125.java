package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_125 {
    private final Production21_125 production = new Production21_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}