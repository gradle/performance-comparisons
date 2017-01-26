package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_438 {
    private final Production41_438 production = new Production41_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}