package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_226 {
    private final Production41_226 production = new Production41_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}