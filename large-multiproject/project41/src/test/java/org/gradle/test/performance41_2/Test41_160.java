package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_160 {
    private final Production41_160 production = new Production41_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}