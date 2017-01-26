package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_272 {
    private final Production56_272 production = new Production56_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}