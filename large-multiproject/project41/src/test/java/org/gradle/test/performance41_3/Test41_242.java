package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_242 {
    private final Production41_242 production = new Production41_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}