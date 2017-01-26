package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_159 {
    private final Production67_159 production = new Production67_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}