package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_13 {
    private final Production41_13 production = new Production41_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}