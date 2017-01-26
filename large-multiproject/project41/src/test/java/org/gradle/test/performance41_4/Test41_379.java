package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_379 {
    private final Production41_379 production = new Production41_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}