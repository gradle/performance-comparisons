package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_252 {
    private final Production41_252 production = new Production41_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}