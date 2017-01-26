package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_146 {
    private final Production56_146 production = new Production56_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}