package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_117 {
    private final Production89_117 production = new Production89_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}