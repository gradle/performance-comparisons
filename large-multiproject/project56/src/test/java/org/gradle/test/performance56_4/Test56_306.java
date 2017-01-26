package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_306 {
    private final Production56_306 production = new Production56_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}