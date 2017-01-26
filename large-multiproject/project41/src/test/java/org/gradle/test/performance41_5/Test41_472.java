package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_472 {
    private final Production41_472 production = new Production41_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}