package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_79 {
    private final Production41_79 production = new Production41_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}