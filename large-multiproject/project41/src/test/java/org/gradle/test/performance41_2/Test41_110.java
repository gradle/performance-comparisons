package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_110 {
    private final Production41_110 production = new Production41_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}