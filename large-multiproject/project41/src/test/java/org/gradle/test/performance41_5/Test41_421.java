package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_421 {
    private final Production41_421 production = new Production41_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}