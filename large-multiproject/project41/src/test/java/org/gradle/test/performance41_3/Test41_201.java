package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_201 {
    private final Production41_201 production = new Production41_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}