package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_90 {
    private final Production56_90 production = new Production56_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}