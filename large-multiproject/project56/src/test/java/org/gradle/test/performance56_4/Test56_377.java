package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_377 {
    private final Production56_377 production = new Production56_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}