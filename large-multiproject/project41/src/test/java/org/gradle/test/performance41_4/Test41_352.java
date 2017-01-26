package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_352 {
    private final Production41_352 production = new Production41_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}