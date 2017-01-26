package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_262 {
    private final Production63_262 production = new Production63_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}