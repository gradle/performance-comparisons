package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_299 {
    private final Production41_299 production = new Production41_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}