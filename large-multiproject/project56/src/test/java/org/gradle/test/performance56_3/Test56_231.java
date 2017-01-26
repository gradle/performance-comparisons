package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_231 {
    private final Production56_231 production = new Production56_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}