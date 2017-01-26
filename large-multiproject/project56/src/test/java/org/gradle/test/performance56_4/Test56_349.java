package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_349 {
    private final Production56_349 production = new Production56_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}