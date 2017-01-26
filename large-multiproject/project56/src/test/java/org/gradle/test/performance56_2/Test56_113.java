package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_113 {
    private final Production56_113 production = new Production56_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}