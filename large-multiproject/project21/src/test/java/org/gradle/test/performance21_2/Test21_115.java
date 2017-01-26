package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_115 {
    private final Production21_115 production = new Production21_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}