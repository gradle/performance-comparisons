package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_441 {
    private final Production41_441 production = new Production41_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}