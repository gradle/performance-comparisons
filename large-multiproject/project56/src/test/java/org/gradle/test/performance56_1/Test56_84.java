package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_84 {
    private final Production56_84 production = new Production56_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}