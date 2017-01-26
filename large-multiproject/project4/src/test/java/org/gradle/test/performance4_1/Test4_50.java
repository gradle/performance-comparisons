package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_50 {
    private final Production4_50 production = new Production4_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}