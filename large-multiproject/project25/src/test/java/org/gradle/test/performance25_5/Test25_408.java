package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_408 {
    private final Production25_408 production = new Production25_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}