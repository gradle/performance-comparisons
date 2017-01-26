package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_461 {
    private final Production56_461 production = new Production56_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}