package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_258 {
    private final Production41_258 production = new Production41_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}