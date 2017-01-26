package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_117 {
    private final Production67_117 production = new Production67_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}