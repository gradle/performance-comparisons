package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_453 {
    private final Production41_453 production = new Production41_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}