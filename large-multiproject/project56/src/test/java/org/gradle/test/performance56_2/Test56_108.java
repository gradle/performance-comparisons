package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_108 {
    private final Production56_108 production = new Production56_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}