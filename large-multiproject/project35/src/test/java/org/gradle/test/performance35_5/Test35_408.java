package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_408 {
    private final Production35_408 production = new Production35_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}