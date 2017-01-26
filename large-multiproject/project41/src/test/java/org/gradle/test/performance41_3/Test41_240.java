package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_240 {
    private final Production41_240 production = new Production41_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}