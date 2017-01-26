package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_344 {
    private final Production41_344 production = new Production41_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}