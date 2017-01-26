package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_421 {
    private final Production56_421 production = new Production56_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}