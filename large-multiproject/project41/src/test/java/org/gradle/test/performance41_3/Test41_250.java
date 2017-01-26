package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_250 {
    private final Production41_250 production = new Production41_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}