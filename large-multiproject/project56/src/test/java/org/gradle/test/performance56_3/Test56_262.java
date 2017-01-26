package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_262 {
    private final Production56_262 production = new Production56_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}