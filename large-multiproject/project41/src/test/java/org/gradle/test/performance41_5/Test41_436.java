package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_436 {
    private final Production41_436 production = new Production41_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}