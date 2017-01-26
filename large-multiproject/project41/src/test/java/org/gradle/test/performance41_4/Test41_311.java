package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_311 {
    private final Production41_311 production = new Production41_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}