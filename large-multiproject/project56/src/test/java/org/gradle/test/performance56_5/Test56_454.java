package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_454 {
    private final Production56_454 production = new Production56_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}