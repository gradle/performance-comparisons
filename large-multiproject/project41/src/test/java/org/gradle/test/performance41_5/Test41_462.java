package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_462 {
    private final Production41_462 production = new Production41_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}