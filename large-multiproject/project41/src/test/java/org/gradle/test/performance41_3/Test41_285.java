package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_285 {
    private final Production41_285 production = new Production41_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}