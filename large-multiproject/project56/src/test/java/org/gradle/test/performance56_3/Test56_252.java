package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_252 {
    private final Production56_252 production = new Production56_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}