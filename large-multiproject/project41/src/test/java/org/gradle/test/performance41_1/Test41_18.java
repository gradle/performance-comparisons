package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_18 {
    private final Production41_18 production = new Production41_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}