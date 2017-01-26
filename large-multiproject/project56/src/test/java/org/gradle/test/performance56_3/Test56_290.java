package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_290 {
    private final Production56_290 production = new Production56_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}