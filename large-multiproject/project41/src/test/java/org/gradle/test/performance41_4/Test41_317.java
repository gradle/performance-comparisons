package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_317 {
    private final Production41_317 production = new Production41_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}