package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_474 {
    private final Production56_474 production = new Production56_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}