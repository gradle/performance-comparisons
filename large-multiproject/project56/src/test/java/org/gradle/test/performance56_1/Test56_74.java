package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_74 {
    private final Production56_74 production = new Production56_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}