package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_197 {
    private final Production56_197 production = new Production56_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}