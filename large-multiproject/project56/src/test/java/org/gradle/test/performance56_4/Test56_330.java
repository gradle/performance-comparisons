package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_330 {
    private final Production56_330 production = new Production56_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}