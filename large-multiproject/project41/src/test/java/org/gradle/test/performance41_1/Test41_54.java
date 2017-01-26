package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_54 {
    private final Production41_54 production = new Production41_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}