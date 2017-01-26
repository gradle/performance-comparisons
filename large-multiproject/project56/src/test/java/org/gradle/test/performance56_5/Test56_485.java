package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_485 {
    private final Production56_485 production = new Production56_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}