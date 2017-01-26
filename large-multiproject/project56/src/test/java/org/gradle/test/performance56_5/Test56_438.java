package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_438 {
    private final Production56_438 production = new Production56_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}