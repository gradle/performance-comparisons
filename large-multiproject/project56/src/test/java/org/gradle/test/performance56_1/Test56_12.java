package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_12 {
    private final Production56_12 production = new Production56_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}