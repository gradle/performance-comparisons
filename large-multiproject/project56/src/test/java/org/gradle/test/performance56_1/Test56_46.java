package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_46 {
    private final Production56_46 production = new Production56_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}