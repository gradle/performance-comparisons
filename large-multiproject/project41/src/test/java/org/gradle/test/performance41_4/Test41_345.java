package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_345 {
    private final Production41_345 production = new Production41_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}