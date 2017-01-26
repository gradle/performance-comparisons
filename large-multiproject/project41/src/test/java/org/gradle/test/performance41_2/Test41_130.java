package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_130 {
    private final Production41_130 production = new Production41_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}