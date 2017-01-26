package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_374 {
    private final Production41_374 production = new Production41_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}