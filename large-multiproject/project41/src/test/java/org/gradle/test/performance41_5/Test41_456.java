package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_456 {
    private final Production41_456 production = new Production41_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}