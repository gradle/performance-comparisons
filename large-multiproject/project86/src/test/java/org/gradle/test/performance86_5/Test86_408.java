package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_408 {
    private final Production86_408 production = new Production86_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}