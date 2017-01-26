package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_408 {
    private final Production14_408 production = new Production14_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}