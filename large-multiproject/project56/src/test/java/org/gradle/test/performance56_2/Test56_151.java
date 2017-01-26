package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_151 {
    private final Production56_151 production = new Production56_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}