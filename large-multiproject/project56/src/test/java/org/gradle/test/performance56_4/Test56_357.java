package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_357 {
    private final Production56_357 production = new Production56_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}