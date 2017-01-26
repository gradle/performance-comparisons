package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_103 {
    private final Production21_103 production = new Production21_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}