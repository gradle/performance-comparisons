package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_408 {
    private final Production88_408 production = new Production88_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}