package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_391 {
    private final Production41_391 production = new Production41_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}