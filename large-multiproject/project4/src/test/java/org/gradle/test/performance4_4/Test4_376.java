package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_376 {
    private final Production4_376 production = new Production4_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}