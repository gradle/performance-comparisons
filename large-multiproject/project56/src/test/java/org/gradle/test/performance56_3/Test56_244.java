package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_244 {
    private final Production56_244 production = new Production56_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}