package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_340 {
    private final Production56_340 production = new Production56_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}