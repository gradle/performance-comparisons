package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_127 {
    private final Production56_127 production = new Production56_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}