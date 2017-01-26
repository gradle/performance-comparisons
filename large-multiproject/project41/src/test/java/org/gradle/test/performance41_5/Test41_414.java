package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_414 {
    private final Production41_414 production = new Production41_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}