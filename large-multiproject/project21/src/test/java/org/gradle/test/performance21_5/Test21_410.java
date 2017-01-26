package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_410 {
    private final Production21_410 production = new Production21_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}