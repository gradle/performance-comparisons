package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_201 {
    private final Production21_201 production = new Production21_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}