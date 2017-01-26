package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_193 {
    private final Production56_193 production = new Production56_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}