package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_7 {
    private final Production56_7 production = new Production56_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}