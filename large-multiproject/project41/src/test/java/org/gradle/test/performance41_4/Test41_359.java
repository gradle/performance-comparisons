package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_359 {
    private final Production41_359 production = new Production41_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}