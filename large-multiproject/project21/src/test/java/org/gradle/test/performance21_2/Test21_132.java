package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_132 {
    private final Production21_132 production = new Production21_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}