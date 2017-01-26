package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_408 {
    private final Production93_408 production = new Production93_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}