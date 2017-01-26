package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_355 {
    private final Production21_355 production = new Production21_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}