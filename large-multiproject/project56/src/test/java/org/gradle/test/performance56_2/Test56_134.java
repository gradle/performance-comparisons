package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_134 {
    private final Production56_134 production = new Production56_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}