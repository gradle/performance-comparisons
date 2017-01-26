package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_463 {
    private final Production56_463 production = new Production56_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}