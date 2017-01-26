package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_408 {
    private final Production41_408 production = new Production41_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}