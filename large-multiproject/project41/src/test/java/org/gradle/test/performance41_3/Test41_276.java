package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_276 {
    private final Production41_276 production = new Production41_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}