package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_400 {
    private final Production56_400 production = new Production56_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}