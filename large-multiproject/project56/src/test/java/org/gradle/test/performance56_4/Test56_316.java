package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_316 {
    private final Production56_316 production = new Production56_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}