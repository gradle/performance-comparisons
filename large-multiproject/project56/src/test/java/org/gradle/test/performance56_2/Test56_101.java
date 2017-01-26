package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_101 {
    private final Production56_101 production = new Production56_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}