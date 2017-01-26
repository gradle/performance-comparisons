package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_323 {
    private final Production56_323 production = new Production56_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}