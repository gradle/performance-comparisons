package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_484 {
    private final Production41_484 production = new Production41_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}