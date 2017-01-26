package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_171 {
    private final Production41_171 production = new Production41_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}