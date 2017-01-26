package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_235 {
    private final Production56_235 production = new Production56_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}