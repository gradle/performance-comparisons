package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_79 {
    private final Production56_79 production = new Production56_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}