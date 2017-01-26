package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_176 {
    private final Production56_176 production = new Production56_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}