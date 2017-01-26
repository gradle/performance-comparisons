package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_424 {
    private final Production56_424 production = new Production56_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}