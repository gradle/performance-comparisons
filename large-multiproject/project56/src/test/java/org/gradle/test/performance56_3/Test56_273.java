package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_273 {
    private final Production56_273 production = new Production56_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}