package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_150 {
    private final Production41_150 production = new Production41_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}