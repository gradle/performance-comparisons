package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_79 {
    private final Production21_79 production = new Production21_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}