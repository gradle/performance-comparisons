package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_413 {
    private final Production41_413 production = new Production41_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}