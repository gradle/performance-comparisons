package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_304 {
    private final Production41_304 production = new Production41_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}