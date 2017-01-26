package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_127 {
    private final Production41_127 production = new Production41_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}