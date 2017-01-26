package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_160 {
    private final Production21_160 production = new Production21_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}