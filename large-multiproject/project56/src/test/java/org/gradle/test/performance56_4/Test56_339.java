package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_339 {
    private final Production56_339 production = new Production56_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}