package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_184 {
    private final Production41_184 production = new Production41_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}