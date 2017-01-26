package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_74 {
    private final Production41_74 production = new Production41_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}