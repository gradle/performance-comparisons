package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_86 {
    private final Production56_86 production = new Production56_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}