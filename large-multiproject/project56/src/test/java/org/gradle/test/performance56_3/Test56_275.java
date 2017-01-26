package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_275 {
    private final Production56_275 production = new Production56_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}