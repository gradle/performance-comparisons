package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_235 {
    private final Production41_235 production = new Production41_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}