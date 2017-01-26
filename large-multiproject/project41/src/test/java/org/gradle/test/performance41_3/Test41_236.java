package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_236 {
    private final Production41_236 production = new Production41_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}