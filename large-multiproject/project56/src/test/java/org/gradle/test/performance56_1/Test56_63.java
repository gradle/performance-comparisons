package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_63 {
    private final Production56_63 production = new Production56_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}