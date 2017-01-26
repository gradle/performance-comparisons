package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_440 {
    private final Production41_440 production = new Production41_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}