package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_236 {
    private final Production56_236 production = new Production56_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}