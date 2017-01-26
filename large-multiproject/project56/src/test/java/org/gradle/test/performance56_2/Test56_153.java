package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_153 {
    private final Production56_153 production = new Production56_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}