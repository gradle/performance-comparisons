package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_25 {
    private final Production56_25 production = new Production56_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}