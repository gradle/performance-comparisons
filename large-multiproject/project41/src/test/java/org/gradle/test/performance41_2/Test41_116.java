package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_116 {
    private final Production41_116 production = new Production41_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}