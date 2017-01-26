package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_22 {
    private final Production41_22 production = new Production41_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}