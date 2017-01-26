package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_86 {
    private final Production41_86 production = new Production41_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}