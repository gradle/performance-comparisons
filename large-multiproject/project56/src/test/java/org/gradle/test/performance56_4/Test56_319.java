package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_319 {
    private final Production56_319 production = new Production56_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}