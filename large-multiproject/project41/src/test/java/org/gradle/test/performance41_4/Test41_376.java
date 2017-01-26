package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_376 {
    private final Production41_376 production = new Production41_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}