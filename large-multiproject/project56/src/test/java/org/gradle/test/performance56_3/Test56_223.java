package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_223 {
    private final Production56_223 production = new Production56_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}