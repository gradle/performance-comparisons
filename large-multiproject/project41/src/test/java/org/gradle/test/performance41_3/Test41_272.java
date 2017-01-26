package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_272 {
    private final Production41_272 production = new Production41_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}