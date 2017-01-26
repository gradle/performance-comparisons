package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_354 {
    private final Production41_354 production = new Production41_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}