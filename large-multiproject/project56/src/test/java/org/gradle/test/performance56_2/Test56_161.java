package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_161 {
    private final Production56_161 production = new Production56_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}