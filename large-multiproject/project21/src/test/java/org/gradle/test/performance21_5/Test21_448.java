package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_448 {
    private final Production21_448 production = new Production21_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}