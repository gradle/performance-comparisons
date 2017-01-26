package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_169 {
    private final Production56_169 production = new Production56_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}