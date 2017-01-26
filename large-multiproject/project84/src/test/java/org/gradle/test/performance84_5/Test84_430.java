package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_430 {
    private final Production84_430 production = new Production84_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}