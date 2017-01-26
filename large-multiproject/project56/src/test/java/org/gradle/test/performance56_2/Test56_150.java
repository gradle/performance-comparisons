package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_150 {
    private final Production56_150 production = new Production56_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}