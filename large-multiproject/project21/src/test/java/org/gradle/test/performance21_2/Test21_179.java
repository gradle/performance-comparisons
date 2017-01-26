package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_179 {
    private final Production21_179 production = new Production21_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}