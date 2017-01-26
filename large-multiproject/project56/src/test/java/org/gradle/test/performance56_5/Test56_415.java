package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_415 {
    private final Production56_415 production = new Production56_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}