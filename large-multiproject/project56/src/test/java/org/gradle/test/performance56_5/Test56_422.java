package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_422 {
    private final Production56_422 production = new Production56_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}