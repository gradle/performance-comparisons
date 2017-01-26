package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_159 {
    private final Production63_159 production = new Production63_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}