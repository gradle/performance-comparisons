package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_408 {
    private final Production89_408 production = new Production89_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}