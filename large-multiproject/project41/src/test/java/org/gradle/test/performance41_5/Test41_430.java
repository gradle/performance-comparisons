package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_430 {
    private final Production41_430 production = new Production41_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}