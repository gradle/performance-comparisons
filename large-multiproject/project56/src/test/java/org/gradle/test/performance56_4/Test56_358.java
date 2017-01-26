package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_358 {
    private final Production56_358 production = new Production56_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}