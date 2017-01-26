package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_451 {
    private final Production92_451 production = new Production92_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}