package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_182 {
    private final Production56_182 production = new Production56_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}