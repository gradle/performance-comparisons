package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_105 {
    private final Production41_105 production = new Production41_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}