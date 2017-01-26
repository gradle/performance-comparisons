package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_122 {
    private final Production41_122 production = new Production41_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}