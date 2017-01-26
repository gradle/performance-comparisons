package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_430 {
    private final Production75_430 production = new Production75_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}