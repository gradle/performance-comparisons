package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_339 {
    private final Production41_339 production = new Production41_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}