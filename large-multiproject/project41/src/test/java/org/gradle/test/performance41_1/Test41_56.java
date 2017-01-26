package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_56 {
    private final Production41_56 production = new Production41_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}