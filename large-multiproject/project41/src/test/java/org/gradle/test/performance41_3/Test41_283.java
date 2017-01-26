package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_283 {
    private final Production41_283 production = new Production41_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}