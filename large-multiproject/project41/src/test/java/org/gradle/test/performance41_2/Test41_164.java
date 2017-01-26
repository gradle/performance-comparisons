package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_164 {
    private final Production41_164 production = new Production41_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}