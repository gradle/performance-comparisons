package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_491 {
    private final Production41_491 production = new Production41_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}