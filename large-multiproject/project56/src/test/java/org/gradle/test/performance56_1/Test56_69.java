package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_69 {
    private final Production56_69 production = new Production56_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}