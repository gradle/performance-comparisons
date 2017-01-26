package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_363 {
    private final Production41_363 production = new Production41_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}