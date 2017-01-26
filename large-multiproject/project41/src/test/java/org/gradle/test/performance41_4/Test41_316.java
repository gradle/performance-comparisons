package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_316 {
    private final Production41_316 production = new Production41_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}