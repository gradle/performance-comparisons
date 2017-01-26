package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_309 {
    private final Production56_309 production = new Production56_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}