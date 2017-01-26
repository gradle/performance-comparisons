package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_12 {
    private final Production41_12 production = new Production41_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}