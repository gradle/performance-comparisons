package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_315 {
    private final Production13_315 production = new Production13_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}