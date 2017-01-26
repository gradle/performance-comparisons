package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_346 {
    private final Production41_346 production = new Production41_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}