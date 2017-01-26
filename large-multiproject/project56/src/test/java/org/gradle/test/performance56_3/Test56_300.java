package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_300 {
    private final Production56_300 production = new Production56_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}