package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_370 {
    private final Production41_370 production = new Production41_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}