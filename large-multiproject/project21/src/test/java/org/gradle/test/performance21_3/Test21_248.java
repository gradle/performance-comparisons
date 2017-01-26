package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_248 {
    private final Production21_248 production = new Production21_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}