package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_197 {
    private final Production21_197 production = new Production21_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}