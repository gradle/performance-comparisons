package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_340 {
    private final Production41_340 production = new Production41_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}