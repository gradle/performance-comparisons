package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_342 {
    private final Production56_342 production = new Production56_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}