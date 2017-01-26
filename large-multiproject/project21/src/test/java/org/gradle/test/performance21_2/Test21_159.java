package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_159 {
    private final Production21_159 production = new Production21_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}