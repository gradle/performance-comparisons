package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_118 {
    private final Production41_118 production = new Production41_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}