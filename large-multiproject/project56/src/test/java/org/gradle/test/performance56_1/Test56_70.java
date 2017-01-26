package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_70 {
    private final Production56_70 production = new Production56_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}