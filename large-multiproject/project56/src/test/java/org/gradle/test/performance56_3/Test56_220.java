package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_220 {
    private final Production56_220 production = new Production56_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}