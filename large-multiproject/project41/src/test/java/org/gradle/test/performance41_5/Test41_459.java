package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_459 {
    private final Production41_459 production = new Production41_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}