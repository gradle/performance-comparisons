package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_94 {
    private final Production41_94 production = new Production41_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}