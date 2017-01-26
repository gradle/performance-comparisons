package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_493 {
    private final Production41_493 production = new Production41_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}