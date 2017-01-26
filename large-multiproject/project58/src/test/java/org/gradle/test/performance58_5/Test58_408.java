package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_408 {
    private final Production58_408 production = new Production58_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}