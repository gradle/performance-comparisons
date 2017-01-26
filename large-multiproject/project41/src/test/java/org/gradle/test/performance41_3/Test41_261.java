package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_261 {
    private final Production41_261 production = new Production41_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}