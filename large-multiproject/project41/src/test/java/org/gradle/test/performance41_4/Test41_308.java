package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_308 {
    private final Production41_308 production = new Production41_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}