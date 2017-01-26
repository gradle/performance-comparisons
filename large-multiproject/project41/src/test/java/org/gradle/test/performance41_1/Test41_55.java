package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_55 {
    private final Production41_55 production = new Production41_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}