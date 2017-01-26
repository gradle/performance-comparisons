package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_50 {
    private final Production41_50 production = new Production41_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}