package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_287 {
    private final Production41_287 production = new Production41_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}