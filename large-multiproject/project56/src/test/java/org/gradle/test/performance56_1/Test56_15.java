package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_15 {
    private final Production56_15 production = new Production56_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}