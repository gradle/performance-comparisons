package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_348 {
    private final Production56_348 production = new Production56_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}