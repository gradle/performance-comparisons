package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_83 {
    private final Production56_83 production = new Production56_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}