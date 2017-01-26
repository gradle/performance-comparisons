package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_315 {
    private final Production80_315 production = new Production80_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}