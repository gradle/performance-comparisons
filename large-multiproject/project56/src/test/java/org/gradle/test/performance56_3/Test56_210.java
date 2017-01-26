package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_210 {
    private final Production56_210 production = new Production56_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}