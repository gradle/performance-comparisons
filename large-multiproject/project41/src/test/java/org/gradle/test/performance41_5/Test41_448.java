package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_448 {
    private final Production41_448 production = new Production41_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}