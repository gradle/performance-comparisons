package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_155 {
    private final Production56_155 production = new Production56_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}