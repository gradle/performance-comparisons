package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_414 {
    private final Production21_414 production = new Production21_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}