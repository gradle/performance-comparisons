package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_153 {
    private final Production41_153 production = new Production41_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}