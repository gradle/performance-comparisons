package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_383 {
    private final Production63_383 production = new Production63_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}