package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_364 {
    private final Production56_364 production = new Production56_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}