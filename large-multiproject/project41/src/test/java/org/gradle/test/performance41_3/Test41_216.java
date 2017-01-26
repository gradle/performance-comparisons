package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_216 {
    private final Production41_216 production = new Production41_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}