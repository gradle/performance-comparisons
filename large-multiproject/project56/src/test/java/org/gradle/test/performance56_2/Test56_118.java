package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_118 {
    private final Production56_118 production = new Production56_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}