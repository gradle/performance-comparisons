package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_431 {
    private final Production56_431 production = new Production56_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}