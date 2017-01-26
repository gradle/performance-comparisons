package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_147 {
    private final Production56_147 production = new Production56_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}