package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_159 {
    private final Production18_159 production = new Production18_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}