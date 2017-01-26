package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_177 {
    private final Production41_177 production = new Production41_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}