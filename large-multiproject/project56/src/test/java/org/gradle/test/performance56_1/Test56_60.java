package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_60 {
    private final Production56_60 production = new Production56_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}