package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_434 {
    private final Production21_434 production = new Production21_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}