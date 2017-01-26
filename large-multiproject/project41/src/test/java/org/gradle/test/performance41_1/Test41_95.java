package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_95 {
    private final Production41_95 production = new Production41_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}