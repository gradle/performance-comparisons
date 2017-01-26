package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_115 {
    private final Production41_115 production = new Production41_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}