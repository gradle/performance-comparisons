package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_21 {
    private final Production41_21 production = new Production41_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}