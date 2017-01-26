package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_490 {
    private final Production41_490 production = new Production41_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}