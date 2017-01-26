package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_408 {
    private final Production18_408 production = new Production18_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}