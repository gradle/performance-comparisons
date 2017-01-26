package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_380 {
    private final Production56_380 production = new Production56_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}