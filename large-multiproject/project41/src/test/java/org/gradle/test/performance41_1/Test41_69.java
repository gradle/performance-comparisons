package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_69 {
    private final Production41_69 production = new Production41_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}