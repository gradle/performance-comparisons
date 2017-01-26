package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_408 {
    private final Production4_408 production = new Production4_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}