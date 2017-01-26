package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_132 {
    private final Production41_132 production = new Production41_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}