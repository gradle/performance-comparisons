package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_342 {
    private final Production41_342 production = new Production41_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}