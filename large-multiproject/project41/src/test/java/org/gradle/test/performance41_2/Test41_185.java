package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_185 {
    private final Production41_185 production = new Production41_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}