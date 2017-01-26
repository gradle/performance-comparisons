package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_249 {
    private final Production41_249 production = new Production41_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}