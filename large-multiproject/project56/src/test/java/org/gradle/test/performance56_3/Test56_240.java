package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_240 {
    private final Production56_240 production = new Production56_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}