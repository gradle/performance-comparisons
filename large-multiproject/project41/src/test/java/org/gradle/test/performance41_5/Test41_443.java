package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_443 {
    private final Production41_443 production = new Production41_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}