package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_31 {
    private final Production56_31 production = new Production56_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}