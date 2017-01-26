package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_412 {
    private final Production21_412 production = new Production21_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}