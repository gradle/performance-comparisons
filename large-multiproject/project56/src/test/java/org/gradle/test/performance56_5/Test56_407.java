package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_407 {
    private final Production56_407 production = new Production56_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}