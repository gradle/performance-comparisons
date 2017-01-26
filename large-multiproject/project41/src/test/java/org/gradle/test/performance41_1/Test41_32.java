package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_32 {
    private final Production41_32 production = new Production41_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}