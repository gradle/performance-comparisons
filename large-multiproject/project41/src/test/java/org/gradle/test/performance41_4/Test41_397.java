package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_397 {
    private final Production41_397 production = new Production41_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}