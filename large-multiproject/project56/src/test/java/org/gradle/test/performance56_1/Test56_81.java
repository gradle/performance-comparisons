package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_81 {
    private final Production56_81 production = new Production56_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}