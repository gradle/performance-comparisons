package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_122 {
    private final Production56_122 production = new Production56_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}