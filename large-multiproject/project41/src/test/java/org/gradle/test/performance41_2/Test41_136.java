package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_136 {
    private final Production41_136 production = new Production41_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}