package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_224 {
    private final Production41_224 production = new Production41_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}