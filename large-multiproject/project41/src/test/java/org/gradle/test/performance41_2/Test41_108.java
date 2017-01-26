package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_108 {
    private final Production41_108 production = new Production41_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}