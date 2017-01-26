package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_149 {
    private final Production56_149 production = new Production56_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}