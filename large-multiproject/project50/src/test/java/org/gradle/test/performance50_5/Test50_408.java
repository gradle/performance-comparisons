package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_408 {
    private final Production50_408 production = new Production50_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}