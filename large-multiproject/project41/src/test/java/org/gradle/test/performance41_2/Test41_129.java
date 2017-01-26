package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_129 {
    private final Production41_129 production = new Production41_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}