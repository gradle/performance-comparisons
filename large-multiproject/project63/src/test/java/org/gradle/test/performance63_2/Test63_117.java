package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_117 {
    private final Production63_117 production = new Production63_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}