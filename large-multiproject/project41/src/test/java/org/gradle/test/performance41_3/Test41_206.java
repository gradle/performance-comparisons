package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_206 {
    private final Production41_206 production = new Production41_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}