package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_327 {
    private final Production41_327 production = new Production41_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}