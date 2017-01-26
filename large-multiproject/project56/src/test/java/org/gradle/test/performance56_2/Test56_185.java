package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_185 {
    private final Production56_185 production = new Production56_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}