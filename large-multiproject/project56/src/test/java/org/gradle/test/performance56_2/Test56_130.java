package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_130 {
    private final Production56_130 production = new Production56_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}