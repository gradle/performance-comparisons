package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_70 {
    private final Production21_70 production = new Production21_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}