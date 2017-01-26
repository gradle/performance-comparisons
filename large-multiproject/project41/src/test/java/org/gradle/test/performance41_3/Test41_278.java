package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_278 {
    private final Production41_278 production = new Production41_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}