package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_397 {
    private final Production56_397 production = new Production56_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}