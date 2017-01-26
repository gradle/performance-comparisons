package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_309 {
    private final Production41_309 production = new Production41_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}