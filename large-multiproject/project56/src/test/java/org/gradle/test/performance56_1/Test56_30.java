package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_30 {
    private final Production56_30 production = new Production56_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}