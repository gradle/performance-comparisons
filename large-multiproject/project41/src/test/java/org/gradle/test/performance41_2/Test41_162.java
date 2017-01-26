package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_162 {
    private final Production41_162 production = new Production41_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}