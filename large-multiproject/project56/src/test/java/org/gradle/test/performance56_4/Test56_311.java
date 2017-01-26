package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_311 {
    private final Production56_311 production = new Production56_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}