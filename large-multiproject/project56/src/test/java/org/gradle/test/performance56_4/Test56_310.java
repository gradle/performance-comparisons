package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_310 {
    private final Production56_310 production = new Production56_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}