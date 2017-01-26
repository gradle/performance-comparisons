package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_343 {
    private final Production41_343 production = new Production41_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}