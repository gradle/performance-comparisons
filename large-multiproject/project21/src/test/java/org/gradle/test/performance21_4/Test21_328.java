package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_328 {
    private final Production21_328 production = new Production21_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}