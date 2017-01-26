package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_23 {
    private final Production21_23 production = new Production21_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}