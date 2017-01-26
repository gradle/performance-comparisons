package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_440 {
    private final Production56_440 production = new Production56_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}