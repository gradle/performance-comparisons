package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_116 {
    private final Production21_116 production = new Production21_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}