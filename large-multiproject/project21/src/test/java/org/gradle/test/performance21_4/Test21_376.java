package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_376 {
    private final Production21_376 production = new Production21_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}