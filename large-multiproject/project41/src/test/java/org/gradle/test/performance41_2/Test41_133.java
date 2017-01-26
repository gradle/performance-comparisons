package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_133 {
    private final Production41_133 production = new Production41_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}