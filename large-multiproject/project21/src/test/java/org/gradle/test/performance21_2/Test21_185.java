package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_185 {
    private final Production21_185 production = new Production21_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}