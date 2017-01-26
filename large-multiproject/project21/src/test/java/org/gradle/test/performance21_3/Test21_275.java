package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_275 {
    private final Production21_275 production = new Production21_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}