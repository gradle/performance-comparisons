package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_332 {
    private final Production41_332 production = new Production41_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}