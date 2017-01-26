package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_113 {
    private final Production41_113 production = new Production41_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}