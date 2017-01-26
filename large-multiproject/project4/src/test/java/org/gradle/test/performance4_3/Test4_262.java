package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_262 {
    private final Production4_262 production = new Production4_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}