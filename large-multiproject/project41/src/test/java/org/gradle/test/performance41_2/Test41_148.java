package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_148 {
    private final Production41_148 production = new Production41_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}