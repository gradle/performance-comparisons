package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_117 {
    private final Production92_117 production = new Production92_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}