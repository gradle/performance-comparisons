package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_256 {
    private final Production56_256 production = new Production56_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}