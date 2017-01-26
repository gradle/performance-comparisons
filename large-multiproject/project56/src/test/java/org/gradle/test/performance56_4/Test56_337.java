package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_337 {
    private final Production56_337 production = new Production56_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}