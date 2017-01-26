package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_462 {
    private final Production21_462 production = new Production21_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}