package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_371 {
    private final Production41_371 production = new Production41_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}