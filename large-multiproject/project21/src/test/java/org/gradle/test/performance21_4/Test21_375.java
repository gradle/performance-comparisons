package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_375 {
    private final Production21_375 production = new Production21_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}