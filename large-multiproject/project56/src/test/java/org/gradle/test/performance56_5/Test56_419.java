package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_419 {
    private final Production56_419 production = new Production56_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}