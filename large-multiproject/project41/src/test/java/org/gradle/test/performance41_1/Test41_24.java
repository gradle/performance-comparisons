package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_24 {
    private final Production41_24 production = new Production41_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}