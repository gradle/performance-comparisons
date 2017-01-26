package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_52 {
    private final Production41_52 production = new Production41_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}