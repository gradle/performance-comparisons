package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_165 {
    private final Production56_165 production = new Production56_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}