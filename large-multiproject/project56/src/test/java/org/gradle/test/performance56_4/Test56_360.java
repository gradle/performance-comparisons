package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_360 {
    private final Production56_360 production = new Production56_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}