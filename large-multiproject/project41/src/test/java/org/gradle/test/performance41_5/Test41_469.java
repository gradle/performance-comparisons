package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_469 {
    private final Production41_469 production = new Production41_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}