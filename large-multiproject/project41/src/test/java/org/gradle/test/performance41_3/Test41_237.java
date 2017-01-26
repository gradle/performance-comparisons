package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_237 {
    private final Production41_237 production = new Production41_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}