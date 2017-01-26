package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_135 {
    private final Production41_135 production = new Production41_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}