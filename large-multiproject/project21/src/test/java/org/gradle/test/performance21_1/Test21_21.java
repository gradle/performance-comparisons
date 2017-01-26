package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_21 {
    private final Production21_21 production = new Production21_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}