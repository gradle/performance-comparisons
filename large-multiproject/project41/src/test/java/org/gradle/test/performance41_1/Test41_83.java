package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_83 {
    private final Production41_83 production = new Production41_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}