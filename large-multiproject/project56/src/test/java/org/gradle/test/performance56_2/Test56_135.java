package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_135 {
    private final Production56_135 production = new Production56_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}