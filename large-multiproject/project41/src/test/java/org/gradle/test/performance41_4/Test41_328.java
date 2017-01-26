package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_328 {
    private final Production41_328 production = new Production41_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}