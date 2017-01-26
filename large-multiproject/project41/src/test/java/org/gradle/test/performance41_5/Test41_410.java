package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_410 {
    private final Production41_410 production = new Production41_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}