package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_355 {
    private final Production41_355 production = new Production41_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}