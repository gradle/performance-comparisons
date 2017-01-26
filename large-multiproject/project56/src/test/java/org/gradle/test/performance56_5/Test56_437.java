package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_437 {
    private final Production56_437 production = new Production56_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}