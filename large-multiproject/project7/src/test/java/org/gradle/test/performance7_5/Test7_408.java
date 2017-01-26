package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_408 {
    private final Production7_408 production = new Production7_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}