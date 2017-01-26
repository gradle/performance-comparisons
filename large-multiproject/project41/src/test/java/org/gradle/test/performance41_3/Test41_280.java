package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_280 {
    private final Production41_280 production = new Production41_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}