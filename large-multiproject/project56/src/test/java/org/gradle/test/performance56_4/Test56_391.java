package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_391 {
    private final Production56_391 production = new Production56_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}