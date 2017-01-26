package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_423 {
    private final Production41_423 production = new Production41_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}