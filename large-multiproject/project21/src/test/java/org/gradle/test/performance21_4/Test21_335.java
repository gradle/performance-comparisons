package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_335 {
    private final Production21_335 production = new Production21_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}