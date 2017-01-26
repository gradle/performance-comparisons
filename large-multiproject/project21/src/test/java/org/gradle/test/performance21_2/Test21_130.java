package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_130 {
    private final Production21_130 production = new Production21_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}