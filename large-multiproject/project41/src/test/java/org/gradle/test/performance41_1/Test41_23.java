package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_23 {
    private final Production41_23 production = new Production41_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}