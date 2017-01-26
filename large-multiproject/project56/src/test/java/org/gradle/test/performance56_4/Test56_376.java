package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_376 {
    private final Production56_376 production = new Production56_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}