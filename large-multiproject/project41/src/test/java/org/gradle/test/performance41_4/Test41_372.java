package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_372 {
    private final Production41_372 production = new Production41_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}