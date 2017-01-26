package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_318 {
    private final Production41_318 production = new Production41_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}