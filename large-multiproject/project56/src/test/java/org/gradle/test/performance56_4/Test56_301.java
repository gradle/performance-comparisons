package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_301 {
    private final Production56_301 production = new Production56_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}