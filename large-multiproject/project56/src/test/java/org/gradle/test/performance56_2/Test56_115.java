package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_115 {
    private final Production56_115 production = new Production56_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}