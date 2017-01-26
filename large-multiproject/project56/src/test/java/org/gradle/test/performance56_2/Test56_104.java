package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_104 {
    private final Production56_104 production = new Production56_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}