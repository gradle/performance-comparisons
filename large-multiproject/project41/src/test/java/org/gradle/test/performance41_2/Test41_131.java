package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_131 {
    private final Production41_131 production = new Production41_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}