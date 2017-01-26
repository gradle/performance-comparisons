package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_315 {
    private final Production35_315 production = new Production35_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}