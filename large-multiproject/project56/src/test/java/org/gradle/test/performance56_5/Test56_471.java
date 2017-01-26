package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_471 {
    private final Production56_471 production = new Production56_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}