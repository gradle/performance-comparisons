package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_70 {
    private final Production41_70 production = new Production41_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}