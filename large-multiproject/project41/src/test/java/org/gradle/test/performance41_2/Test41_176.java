package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_176 {
    private final Production41_176 production = new Production41_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}