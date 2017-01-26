package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_223 {
    private final Production41_223 production = new Production41_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}