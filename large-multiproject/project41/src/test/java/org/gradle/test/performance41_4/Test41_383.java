package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_383 {
    private final Production41_383 production = new Production41_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}