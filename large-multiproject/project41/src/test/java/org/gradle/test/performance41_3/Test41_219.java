package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_219 {
    private final Production41_219 production = new Production41_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}