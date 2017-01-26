package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_271 {
    private final Production41_271 production = new Production41_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}