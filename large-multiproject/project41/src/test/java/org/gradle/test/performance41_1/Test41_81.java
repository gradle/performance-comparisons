package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_81 {
    private final Production41_81 production = new Production41_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}