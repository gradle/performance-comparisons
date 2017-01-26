package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_169 {
    private final Production41_169 production = new Production41_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}