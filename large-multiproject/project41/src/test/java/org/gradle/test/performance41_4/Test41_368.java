package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_368 {
    private final Production41_368 production = new Production41_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}