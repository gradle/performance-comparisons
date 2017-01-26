package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_464 {
    private final Production56_464 production = new Production56_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}