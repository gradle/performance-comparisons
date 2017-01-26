package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_408 {
    private final Production15_408 production = new Production15_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}