package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_117 {
    private final Production56_117 production = new Production56_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}