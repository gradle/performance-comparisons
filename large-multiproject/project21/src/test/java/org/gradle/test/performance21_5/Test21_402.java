package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_402 {
    private final Production21_402 production = new Production21_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}