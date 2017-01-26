package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_53 {
    private final Production56_53 production = new Production56_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}