package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_19 {
    private final Production41_19 production = new Production41_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}