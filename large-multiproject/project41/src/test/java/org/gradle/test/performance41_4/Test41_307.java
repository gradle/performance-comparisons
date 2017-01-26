package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_307 {
    private final Production41_307 production = new Production41_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}