package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_33 {
    private final Production56_33 production = new Production56_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}