package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_178 {
    private final Production41_178 production = new Production41_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}