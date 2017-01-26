package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_208 {
    private final Production41_208 production = new Production41_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}