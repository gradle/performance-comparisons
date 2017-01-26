package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_333 {
    private final Production41_333 production = new Production41_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}