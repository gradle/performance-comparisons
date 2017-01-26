package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_361 {
    private final Production56_361 production = new Production56_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}