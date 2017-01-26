package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_333 {
    private final Production21_333 production = new Production21_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}