package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_218 {
    private final Production41_218 production = new Production41_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}