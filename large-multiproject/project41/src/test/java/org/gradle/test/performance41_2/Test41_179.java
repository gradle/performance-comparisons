package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_179 {
    private final Production41_179 production = new Production41_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}