package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_308 {
    private final Production56_308 production = new Production56_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}