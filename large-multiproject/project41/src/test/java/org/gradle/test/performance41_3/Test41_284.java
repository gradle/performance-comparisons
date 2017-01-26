package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_284 {
    private final Production41_284 production = new Production41_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}