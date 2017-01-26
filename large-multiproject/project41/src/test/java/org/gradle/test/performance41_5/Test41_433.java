package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_433 {
    private final Production41_433 production = new Production41_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}