package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_125 {
    private final Production56_125 production = new Production56_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}