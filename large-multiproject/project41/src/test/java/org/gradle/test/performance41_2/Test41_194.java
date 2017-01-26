package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_194 {
    private final Production41_194 production = new Production41_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}