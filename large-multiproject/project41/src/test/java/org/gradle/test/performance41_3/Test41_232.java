package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_232 {
    private final Production41_232 production = new Production41_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}