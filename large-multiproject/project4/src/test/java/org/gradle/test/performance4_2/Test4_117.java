package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_117 {
    private final Production4_117 production = new Production4_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}