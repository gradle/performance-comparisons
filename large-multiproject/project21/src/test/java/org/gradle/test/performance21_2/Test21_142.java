package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_142 {
    private final Production21_142 production = new Production21_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}