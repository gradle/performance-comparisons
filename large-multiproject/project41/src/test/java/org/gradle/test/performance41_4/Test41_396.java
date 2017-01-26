package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_396 {
    private final Production41_396 production = new Production41_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}