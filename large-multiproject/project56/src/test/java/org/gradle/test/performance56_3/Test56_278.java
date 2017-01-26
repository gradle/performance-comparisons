package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_278 {
    private final Production56_278 production = new Production56_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}