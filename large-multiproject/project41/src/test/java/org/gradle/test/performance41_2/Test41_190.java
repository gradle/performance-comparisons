package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_190 {
    private final Production41_190 production = new Production41_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}