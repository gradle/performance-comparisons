package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_158 {
    private final Production56_158 production = new Production56_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}