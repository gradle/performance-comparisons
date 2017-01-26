package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_159 {
    private final Production92_159 production = new Production92_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}