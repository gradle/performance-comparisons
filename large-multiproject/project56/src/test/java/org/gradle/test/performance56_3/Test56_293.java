package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_293 {
    private final Production56_293 production = new Production56_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}