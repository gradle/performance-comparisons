package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_205 {
    private final Production41_205 production = new Production41_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}