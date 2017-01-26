package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_149 {
    private final Production21_149 production = new Production21_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}