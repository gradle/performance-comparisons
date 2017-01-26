package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_389 {
    private final Production21_389 production = new Production21_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}