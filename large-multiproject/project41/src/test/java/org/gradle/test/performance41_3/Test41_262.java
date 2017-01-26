package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_262 {
    private final Production41_262 production = new Production41_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}