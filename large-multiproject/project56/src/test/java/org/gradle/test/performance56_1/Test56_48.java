package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_48 {
    private final Production56_48 production = new Production56_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}