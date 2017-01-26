package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_117 {
    private final Production41_117 production = new Production41_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}