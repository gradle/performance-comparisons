package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_489 {
    private final Production41_489 production = new Production41_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}