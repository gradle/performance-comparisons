package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_400 {
    private final Production41_400 production = new Production41_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}