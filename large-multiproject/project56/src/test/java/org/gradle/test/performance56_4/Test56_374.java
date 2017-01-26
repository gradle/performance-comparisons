package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_374 {
    private final Production56_374 production = new Production56_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}