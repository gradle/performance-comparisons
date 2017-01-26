package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_479 {
    private final Production56_479 production = new Production56_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}