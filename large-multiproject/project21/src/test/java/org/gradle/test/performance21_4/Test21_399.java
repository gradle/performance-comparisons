package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_399 {
    private final Production21_399 production = new Production21_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}