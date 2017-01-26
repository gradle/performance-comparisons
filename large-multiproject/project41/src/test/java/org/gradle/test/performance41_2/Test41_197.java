package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_197 {
    private final Production41_197 production = new Production41_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}