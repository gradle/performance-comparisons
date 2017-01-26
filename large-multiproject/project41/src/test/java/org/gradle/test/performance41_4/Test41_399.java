package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_399 {
    private final Production41_399 production = new Production41_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}