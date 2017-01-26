package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_381 {
    private final Production41_381 production = new Production41_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}