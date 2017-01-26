package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_274 {
    private final Production56_274 production = new Production56_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}