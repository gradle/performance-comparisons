package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_110 {
    private final Production21_110 production = new Production21_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}