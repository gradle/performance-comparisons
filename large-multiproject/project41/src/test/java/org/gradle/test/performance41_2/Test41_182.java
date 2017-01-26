package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_182 {
    private final Production41_182 production = new Production41_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}