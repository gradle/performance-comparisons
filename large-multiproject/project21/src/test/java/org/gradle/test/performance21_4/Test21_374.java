package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_374 {
    private final Production21_374 production = new Production21_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}