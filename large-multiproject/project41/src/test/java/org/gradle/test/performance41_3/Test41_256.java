package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_256 {
    private final Production41_256 production = new Production41_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}