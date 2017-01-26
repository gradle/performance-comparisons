package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_336 {
    private final Production41_336 production = new Production41_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}