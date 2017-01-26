package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_260 {
    private final Production56_260 production = new Production56_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}