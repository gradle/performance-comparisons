package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_385 {
    private final Production41_385 production = new Production41_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}