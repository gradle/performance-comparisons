package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_408 {
    private final Production56_408 production = new Production56_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}