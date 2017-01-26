package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_480 {
    private final Production56_480 production = new Production56_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}