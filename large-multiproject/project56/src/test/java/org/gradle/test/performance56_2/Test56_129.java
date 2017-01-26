package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_129 {
    private final Production56_129 production = new Production56_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}