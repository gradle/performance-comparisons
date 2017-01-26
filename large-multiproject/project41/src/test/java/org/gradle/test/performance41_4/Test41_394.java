package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_394 {
    private final Production41_394 production = new Production41_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}