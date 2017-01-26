package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_179 {
    private final Production56_179 production = new Production56_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}