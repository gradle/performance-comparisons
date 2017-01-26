package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_233 {
    private final Production41_233 production = new Production41_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}