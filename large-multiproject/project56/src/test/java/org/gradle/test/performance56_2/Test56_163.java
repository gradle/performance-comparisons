package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_163 {
    private final Production56_163 production = new Production56_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}