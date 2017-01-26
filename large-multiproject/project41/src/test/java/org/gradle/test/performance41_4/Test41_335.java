package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_335 {
    private final Production41_335 production = new Production41_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}