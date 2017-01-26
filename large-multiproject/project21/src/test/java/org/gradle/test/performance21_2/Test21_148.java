package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_148 {
    private final Production21_148 production = new Production21_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}