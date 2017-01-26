package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_203 {
    private final Production41_203 production = new Production41_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}