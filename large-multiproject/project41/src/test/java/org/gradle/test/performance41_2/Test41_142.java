package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_142 {
    private final Production41_142 production = new Production41_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}