package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_137 {
    private final Production56_137 production = new Production56_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}