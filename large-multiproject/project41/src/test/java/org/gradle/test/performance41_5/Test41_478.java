package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_478 {
    private final Production41_478 production = new Production41_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}