package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_301 {
    private final Production41_301 production = new Production41_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}