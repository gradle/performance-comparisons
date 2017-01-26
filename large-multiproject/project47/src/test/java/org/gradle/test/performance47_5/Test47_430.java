package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_430 {
    private final Production47_430 production = new Production47_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}