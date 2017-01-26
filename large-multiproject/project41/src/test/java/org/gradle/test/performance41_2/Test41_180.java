package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_180 {
    private final Production41_180 production = new Production41_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}