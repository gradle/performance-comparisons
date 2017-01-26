package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_229 {
    private final Production56_229 production = new Production56_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}