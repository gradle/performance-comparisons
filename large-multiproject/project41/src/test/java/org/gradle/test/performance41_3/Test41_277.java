package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_277 {
    private final Production41_277 production = new Production41_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}