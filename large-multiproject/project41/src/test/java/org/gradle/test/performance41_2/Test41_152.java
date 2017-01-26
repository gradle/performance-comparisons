package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_152 {
    private final Production41_152 production = new Production41_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}