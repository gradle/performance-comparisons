package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_151 {
    private final Production41_151 production = new Production41_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}