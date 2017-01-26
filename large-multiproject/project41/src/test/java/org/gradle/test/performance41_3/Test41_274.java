package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_274 {
    private final Production41_274 production = new Production41_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}