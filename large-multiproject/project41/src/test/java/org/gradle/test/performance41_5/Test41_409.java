package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_409 {
    private final Production41_409 production = new Production41_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}