package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_121 {
    private final Production56_121 production = new Production56_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}