package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_292 {
    private final Production41_292 production = new Production41_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}