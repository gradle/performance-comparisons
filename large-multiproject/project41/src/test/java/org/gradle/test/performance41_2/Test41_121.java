package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_121 {
    private final Production41_121 production = new Production41_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}