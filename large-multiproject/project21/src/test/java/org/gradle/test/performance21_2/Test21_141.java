package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_141 {
    private final Production21_141 production = new Production21_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}