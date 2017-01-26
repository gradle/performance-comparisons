package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_206 {
    private final Production56_206 production = new Production56_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}