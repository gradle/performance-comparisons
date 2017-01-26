package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_56 {
    private final Production21_56 production = new Production21_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}