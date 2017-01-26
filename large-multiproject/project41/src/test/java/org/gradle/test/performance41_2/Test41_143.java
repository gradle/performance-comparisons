package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_143 {
    private final Production41_143 production = new Production41_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}