package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_493 {
    private final Production21_493 production = new Production21_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}