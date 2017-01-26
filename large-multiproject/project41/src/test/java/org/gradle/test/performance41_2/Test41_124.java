package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_124 {
    private final Production41_124 production = new Production41_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}