package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_240 {
    private final Production21_240 production = new Production21_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}