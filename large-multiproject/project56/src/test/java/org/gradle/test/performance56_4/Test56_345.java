package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_345 {
    private final Production56_345 production = new Production56_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}