package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_254 {
    private final Production41_254 production = new Production41_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}