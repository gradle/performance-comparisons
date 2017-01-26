package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_289 {
    private final Production56_289 production = new Production56_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}