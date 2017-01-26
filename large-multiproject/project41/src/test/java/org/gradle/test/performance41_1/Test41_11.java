package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_11 {
    private final Production41_11 production = new Production41_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}