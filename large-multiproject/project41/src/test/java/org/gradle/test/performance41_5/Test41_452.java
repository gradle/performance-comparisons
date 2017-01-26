package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_452 {
    private final Production41_452 production = new Production41_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}