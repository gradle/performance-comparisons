package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_56 {
    private final Production56_56 production = new Production56_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}