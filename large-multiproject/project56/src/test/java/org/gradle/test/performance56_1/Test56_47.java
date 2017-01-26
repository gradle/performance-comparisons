package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_47 {
    private final Production56_47 production = new Production56_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}