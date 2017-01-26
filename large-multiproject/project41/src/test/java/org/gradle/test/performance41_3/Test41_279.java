package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_279 {
    private final Production41_279 production = new Production41_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}