package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_158 {
    private final Production41_158 production = new Production41_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}