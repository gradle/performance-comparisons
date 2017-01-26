package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_408 {
    private final Production84_408 production = new Production84_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}