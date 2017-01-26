package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_211 {
    private final Production56_211 production = new Production56_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}