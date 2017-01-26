package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_69 {
    private final Production21_69 production = new Production21_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}