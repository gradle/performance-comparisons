package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_129 {
    private final Production21_129 production = new Production21_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}