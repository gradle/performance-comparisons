package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_499 {
    private final Production41_499 production = new Production41_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}