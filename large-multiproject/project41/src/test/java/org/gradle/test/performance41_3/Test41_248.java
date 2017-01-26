package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_248 {
    private final Production41_248 production = new Production41_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}