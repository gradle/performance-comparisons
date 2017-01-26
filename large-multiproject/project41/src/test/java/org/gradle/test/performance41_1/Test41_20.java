package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_20 {
    private final Production41_20 production = new Production41_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}